package com.nitin.openai.controller;

import com.nitin.openai.dto.BookDetails;
import com.nitin.openai.service.AIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AIController {

    @Autowired
    AIService aiService;

    @GetMapping("/joke")
    public String getJoke(@RequestParam String topic){
        return aiService.getJoke(topic);
    }

    @GetMapping("/books")
    public String getBooks(@RequestParam String category, @RequestParam String year){
        return aiService.getBooks(category, year);
    }

    @GetMapping("/booksInJSON")
    public BookDetails getBooksInJSON(@RequestParam String category, @RequestParam String year){
        return aiService.getBooksInJson(category, year);
    }
}
package com.example.securingapi2.controller;

import com.example.securingapi2.service.InputSanitizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private InputSanitizationService inputSanitizationService;

    @PostMapping("/sanitize")
    public String sanitizeUserInput(@RequestBody String userInput) {
        return inputSanitizationService.sanitizeInput(userInput);
    }
}
package com.example.securingapi2.service;

import org.owasp.encoder.Encode;
import org.springframework.stereotype.Service;

@Service
public class InputSanitizationService {

    public String sanitizeInput(String input) {
        return Encode.forHtml(input);
    }
}
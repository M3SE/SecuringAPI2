package com.example.securingapi2.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserInputDTO {

    @NotNull
    @Size(min = 1, max = 100)
    private String name;

    // Getters and Setters
}
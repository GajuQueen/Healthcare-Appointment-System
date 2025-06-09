package com.example.demo.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

    @Data
    public class RegisterRequest {
        @NotBlank
        @Size(max = 50)
        private String firstName;

        @NotBlank
        @Size(max = 50)
        private String lastName;

        @NotBlank
        @Email
        @Size(max = 50)
        private String email;

        @NotBlank
        private String password;
    }


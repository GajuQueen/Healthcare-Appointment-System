package com.example.demo.Dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserDto {
    @NotBlank
    @Schema(required = true, maxLength = 50)
    private String firstName;
    @NotBlank
    @Schema(required = true, maxLength =50)
    private String lastName;
    @NotBlank
    @Schema(required = true, maxLength = 50)
    @Column(unique = true)
    private String email;
    private String password;
}


package com.example.demo.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PatientDTO {
    @NotNull(message = "Clinic ID is required")
    private Integer clinicId;
    private String Firstname;
    private String Lastname;
    private String Phone;
    @Email(message = "Provide a valid email")
    @NotBlank(message = "Email is required")
    private String Email;
    @NotNull(message = "Date of Birth is required")
    @Past(message = "Date of birth must be a past date")
    private LocalDate dateOfBirth;
}

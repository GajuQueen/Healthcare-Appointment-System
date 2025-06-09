package com.example.demo.Doctor;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DoctorDto {
    Integer clinicId;
    private String Firstname;
    private String Lastname;
    @Email(message = "Provide a valid email")
    @NotBlank(message = "Email is required")
    private String Email;
    @NotNull(message = "Speciality is required")
    private Specialist Speciality;

}

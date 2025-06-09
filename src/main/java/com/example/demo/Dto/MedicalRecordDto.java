package com.example.demo.Dto;

import jakarta.validation.constraints.PastOrPresent;
import lombok.Value;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;

@Value
public class MedicalRecordDto {
    @Length(message = "you cant exceed 255 characters", max = 255)
    String diagnosis;
    @Length(message = "you cant exceed 500 characters", min = 0, max = 500)
    String prescription;
    @PastOrPresent
    LocalDateTime recordDate;
}

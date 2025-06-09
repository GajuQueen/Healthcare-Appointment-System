package com.example.demo.Dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class MedicalRecordDto {
    private Long patientId;
    private Long doctorId;
    private String diagnosis;
    private String prescription;
    private LocalDateTime recordDate;
}
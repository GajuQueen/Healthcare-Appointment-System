package com.example.demo.Appointment;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AppointmentDto {
    Integer patientId;
    Integer doctorId;
    @Enumerated(EnumType.STRING)
    private AppointmentStatus status;
    private String notes;
    private LocalDate appointmentDate;
}

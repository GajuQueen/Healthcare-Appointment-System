package com.example.demo.Appointment;

import com.example.demo.Common;
import com.example.demo.Doctor.Doctor;
import com.example.demo.Patient.Patient;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Appointment extends Common {
    
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    @JsonBackReference
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    @JsonBackReference
    private Patient patient;

    @NotNull(message = "AppointmentDate is required")
    @Future(message = "AppointmentDate must be in the future")
    private LocalDate appointmentDate;

    @Enumerated(EnumType.STRING)
    private AppointmentStatus status;

    @Column(length = 50)
    private String notes;







}

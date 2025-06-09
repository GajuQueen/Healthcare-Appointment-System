package com.example.demo.Patient;

import com.example.demo.Appointment.Appointment;
import com.example.demo.Clinic.Clinic;
import com.example.demo.Common;
import com.example.demo.MedicalRecords.MedicalRecords;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class Patient extends Common {

    @NotNull(message = "Date of Birth is required")
    @Past(message = "Date of birth must be a past date")
    private LocalDate dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "clinic_id")
    @JsonBackReference
    private Clinic clinic;

    @OneToMany(mappedBy = "patient")
    @JsonManagedReference
    private List<Appointment> appointments;

    @OneToMany(mappedBy = "patient")
    @JsonManagedReference
    private List<MedicalRecords> medicalRecords;


}

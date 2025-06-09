package com.example.demo.MedicalRecords;

import com.example.demo.Common;
import com.example.demo.Doctor.Doctor;
import com.example.demo.Patient.Patient;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MedicalRecord extends Common {
    @Length(message = "you cant exceed 500 characters", min = 0, max = 500)
    @Column(length = 500)
    private String prescription;
    @PastOrPresent
    @Column(nullable = false)
    private LocalDateTime recordDate;
    @Length(message = "you cant exceed 255 characters", max = 255)
    @Column(nullable = false)
    private String diagnosis;
    @ManyToOne
    @JoinColumn(name ="patient_id")
    @JsonManagedReference("patient-medicalrecords")
private Patient patient;
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    @JsonBackReference("doctor-medicalrecords")
    private Doctor doctor;
}

package com.example.demo.Dto;

import com.example.demo.Doctor.Doctor;
import com.example.demo.Patient.Patient;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;
@Data
public class ClinicDto {

    @Column(nullable = false, unique = true, length = 100)
    @NotBlank
    private String name;
    @Column(nullable = false, length = 255)
    @NotBlank
    private String address;
    @Column(nullable = false, length = 20)
    @NotBlank
    private String phone;
    @OneToMany(mappedBy = "clinic", cascade = CascadeType.ALL)
    private List<Patient> patient;
    @OneToMany(mappedBy = "clinic")
    private List<Doctor> doctors;

}


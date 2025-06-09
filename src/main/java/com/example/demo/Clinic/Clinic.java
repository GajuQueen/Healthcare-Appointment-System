package com.example.demo.Clinic;

import com.example.demo.Common;
import com.example.demo.Doctor.Doctor;
import com.example.demo.Patient.Patient;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Clinic extends Common {
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

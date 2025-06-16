package com.example.demo.Dto;

import com.example.demo.Clinic.Clinic;
import com.example.demo.Doctor.Doctor;
import com.example.demo.Patient.Patient;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
    @NotBlank(message = "Email is required")
    private String email;

    public ClinicDto(Clinic clinic) {
        this.name = clinic.getName();
        this.address = clinic.getAddress();
        this.phone = clinic.getPhone();
        this.email = clinic.getEmail();
    }

}


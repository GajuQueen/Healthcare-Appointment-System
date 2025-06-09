package com.example.demo.Clinic;

import com.example.demo.Common;
import com.example.demo.Patient.Patient;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Clinic extends Common {

    @OneToMany(mappedBy = "clinic")
    private List<Patient> patient;
}

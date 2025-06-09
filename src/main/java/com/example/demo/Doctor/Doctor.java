package com.example.demo.Doctor;

import com.example.demo.Appointment.Appointment;
import com.example.demo.Clinic.Clinic;
import com.example.demo.Common;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
public class Doctor extends Common {

    @NotNull(message = "Speciality is required")
    @Enumerated(EnumType.STRING)
    @Column(length = 100)
    private Specialist Speciality;

    @ManyToOne
    @JoinColumn(name = "clinic_id)")
    private Clinic clinic;

    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointment;

}

package com.example.demo.Appointment;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
    List<Appointment>findAppointmentByPatientIdAndDoctorIdAndDate(Integer patientid, Integer doctorid, LocalDateTime date);
}

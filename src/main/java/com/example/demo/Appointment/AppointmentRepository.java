package com.example.demo.Appointment;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment>findAppointmentByPatientIdAndDoctorIdAndAppointmentDate(long patientid, long doctorid, LocalDate appointmentDate);
}

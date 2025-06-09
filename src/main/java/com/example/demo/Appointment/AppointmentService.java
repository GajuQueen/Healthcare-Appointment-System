package com.example.demo.Appointment;

import com.example.demo.Doctor.Doctor;
import com.example.demo.Doctor.DoctorRepository;
import com.example.demo.Doctor.DoctorService;
import com.example.demo.Patient.Patient;
import com.example.demo.Patient.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;

    public Appointment createAppointment(AppointmentDto dto){
        Patient patient = patientRepository.findById(dto.getPatientId())
                .orElseThrow(() -> new RuntimeException("Patient not found"));

        Doctor doctor = doctorRepository.findById(dto.getDoctorId())
                .orElseThrow(() -> new RuntimeException("Doctor not found"));

        Appointment appointment = new Appointment();
        appointment.setPatient(patient);
        appointment.setDoctor(doctor);
        appointment.setStatus(dto.getStatus());
        appointment.setNotes(dto.getNotes());
        appointment.setAppointmentDate(dto.getAppointmentDate());
        return appointmentRepository.save(appointment);
    }

    public List<Appointment> findAllAppointment(long patientid, long doctorid, LocalDate appointmentDate){
        return appointmentRepository.findAppointmentByPatientIdAndDoctorIdAndAppointmentDate(patientid, doctorid, appointmentDate);

    }

    public Appointment findAppointmentById(long id){
        return appointmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Appointment not Found"));
    }

    public Appointment updateAppointment(long id, AppointmentDto dto){
        Appointment appointment = appointmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Appointment not Found"));
        return appointmentRepository.save(appointment);

    }

    public void deleteAppointment(long id){
        appointmentRepository.deleteById(id);
    }

}

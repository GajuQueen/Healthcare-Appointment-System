package com.example.demo.MedicalRecords;

import com.example.demo.Doctor.Doctor;
import com.example.demo.Doctor.DoctorRepository;
import com.example.demo.Dto.MedicalRecordDto;
import com.example.demo.Patient.Patient;
import com.example.demo.Patient.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MedicalRecordService {
    private final MedicalRecordRepository medicalRecordRepository;
    private final PatientRepository patientRepository;
    private final DoctorRepository doctorRepository;
@Transactional
    public MedicalRecord createMedicalRecord(MedicalRecordDto dto,Long patientId, Long doctorId){
        Patient patient = patientRepository.findById(patientId).orElseThrow(() -> new RuntimeException("Patient not found"));
    Doctor doctor = doctorRepository.findById(doctorId).orElseThrow(() -> new RuntimeException("Doctor is not found"));
    MedicalRecord record = new MedicalRecord();
    record.setPatient(patient);
    record.setDoctor(doctor);
    record.setDiagnosis(dto.getDiagnosis());
    record.setPrescription(dto.getPrescription());

    return medicalRecordRepository.save(record);
    }
}

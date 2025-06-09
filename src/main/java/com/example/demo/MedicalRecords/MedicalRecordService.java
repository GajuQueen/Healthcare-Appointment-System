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

    public MedicalRecord createMedicalRecord(MedicalRecordDto dto, long patientId, long doctorId) {
        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() -> new RuntimeException("Patient not found"));
        Doctor doctor = doctorRepository.findById(doctorId)
                .orElseThrow(() -> new RuntimeException("Doctor not found"));

        MedicalRecord record = new MedicalRecord();
        record.setPatient(patient);
        record.setDoctor(doctor);
        record.setDiagnosis(dto.getDiagnosis());
        record.setPrescription(dto.getPrescription());
        record.setRecordDate(dto.getRecordDate());

        return medicalRecordRepository.save(record);
    }

    public MedicalRecord getMedicalRecordById(long id) {
        return medicalRecordRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("MedicalRecord not found"));
    }

    public MedicalRecord updateMedicalRecord(long id, MedicalRecordDto dto) {
        MedicalRecord record = medicalRecordRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("MedicalRecord not found"));
        record.setDiagnosis(dto.getDiagnosis());
        record.setPrescription(dto.getPrescription());
        return medicalRecordRepository.save(record);
    }

    public void deleteMedicalRecord(long id) {
        medicalRecordRepository.deleteById(id);
    }

}

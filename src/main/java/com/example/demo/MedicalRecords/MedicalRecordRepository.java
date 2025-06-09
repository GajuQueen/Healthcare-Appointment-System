package com.example.demo.MedicalRecords;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Long> {
    List<MedicalRecord> findByPatientId(long patientId);
    List<MedicalRecord> findByDoctorId(long doctorId);
    List<MedicalRecord> findByPatientIdAndDoctorId(long patientId, long doctorId);
}

package com.example.demo.Doctor;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    List<Doctor>  findDoctorByClinicIdAndSpeciality(Long clinicId, Specialist speciality);
}

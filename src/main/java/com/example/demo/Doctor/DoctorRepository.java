package com.example.demo.Doctor;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
    List<Doctor>  findDoctorByClinicAndSpeciality(Integer clinicId, String speciality);
}

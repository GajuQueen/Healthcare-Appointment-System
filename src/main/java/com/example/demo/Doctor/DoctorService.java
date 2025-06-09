package com.example.demo.Doctor;

import com.example.demo.Clinic.Clinic;
import com.example.demo.Clinic.ClinicRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorService {
    public final DoctorRepository doctorRepository;
    public final ClinicRepository clinicRepository;

    public Doctor createDoctor(DoctorDto dto){
        Clinic clinic = clinicRepository.findById(dto.getClinicId())
                .orElseThrow(() -> new RuntimeException("clinic not found"));
        Doctor doctor = new Doctor();
        doctor.setFirstname(dto.getFirstname());
        doctor.setLastname(dto.getLastname());
        doctor.setEmail(dto.getEmail());
        doctor.setSpeciality(dto.getSpeciality());
        return doctorRepository.save(doctor);
    }

    public List<Doctor> getAllDoctors(Integer clinicId, String speciality) {
        return doctorRepository.findDoctorByClinicAndSpeciality(clinicId, speciality);

    }

    public Doctor getDoctorById(int id){
        return doctorRepository.findById(id).get();
    }

    public Doctor updateDoctor(Integer id, DoctorDto dto){
        Doctor doctor = new Doctor();
        doctor.setFirstname(dto.getFirstname());
        doctor.setLastname(dto.getLastname());
        doctor.setEmail(dto.getEmail());
        doctor.setSpeciality(dto.getSpeciality());
        return doctorRepository.save(doctor);
    }

    public void deleteDoctor(Integer id){
        doctorRepository.deleteById(id);
    }


}

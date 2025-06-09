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

    public List<Doctor> getAllDoctors(Long clinicId,Specialist speciality) {
        return doctorRepository.findDoctorByClinicIdAndSpeciality(clinicId, speciality);

    }

    public Doctor getDoctorById(long id){
        return doctorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor not found"));
    }

    public Doctor updateDoctor(long id, DoctorDto dto){
        Doctor doctor = new Doctor();
        doctor.setFirstname(dto.getFirstname());
        doctor.setLastname(dto.getLastname());
        doctor.setEmail(dto.getEmail());
        doctor.setSpeciality(dto.getSpeciality());
        return doctorRepository.save(doctor);
    }

    public void deleteDoctor(long id){
        doctorRepository.deleteById(id);
    }


}

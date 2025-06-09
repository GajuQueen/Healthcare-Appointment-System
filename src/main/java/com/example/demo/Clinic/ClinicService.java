package com.example.demo.Clinic;

import com.example.demo.Dto.ClinicDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClinicService {
    private final ClinicRepository clinicRepository;

    public Clinic createClinic(ClinicDto dto) {
        Clinic clinic = new Clinic();

        clinic.setName(dto.getName());
        clinic.setAddress(dto.getAddress());
        clinic.setPhone(dto.getPhone());
        return clinicRepository.save(clinic);
    }

    public List<Clinic> getAllClinics() {
        return clinicRepository.findAll();
    }
    public Clinic getClinicById(long id){
        return clinicRepository.findById(id).orElseThrow(() -> new RuntimeException("Clinic not Found."));
    }

    public Clinic updateClinic(long id,ClinicDto dto){

        Clinic clinic = clinicRepository.findById(id).orElseThrow(() -> new RuntimeException("clinic not found."));
        clinic.setName(dto.getName());
        clinic.setAddress(dto.getAddress());
        clinic.setPhone(dto.getPhone());
        return clinicRepository.save(clinic);
    }
    public void deleteClinicById(long id){
        Clinic clinic = clinicRepository.findById(id).orElseThrow(() -> new RuntimeException("Clinic not found"));
        clinicRepository.delete(clinic);
    }
}



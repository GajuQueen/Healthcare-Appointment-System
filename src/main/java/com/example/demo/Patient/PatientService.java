package com.example.demo.Patient;

import com.example.demo.Dto.PatientDTO;
import com.example.demo.User.User;
import com.example.demo.User.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;




@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;
    private final UserRepository userRepository;


    public Patient createPatient(PatientDTO dto){
//        User user = userRepository.findById(clinicId).orElseThrow(()->new RuntimeException("user not found"));

        Patient patient1 = new Patient();
        patient1.setFirstname(dto.getFirstname());
        patient1.setLastname(dto.getLastname());
        patient1.setPhone(dto.getPhone());
        patient1.setEmail(dto.getEmail());
        patient1.setDateOfBirth(dto.getDateOfBirth());
        return patientRepository.save(patient1);
    }

    public Page<Patient> findByClinicId(Long clinicId, int page, int size){
        Pageable pageable1 = PageRequest.of(page, size);
        return patientRepository.findByClinicId(clinicId, pageable1);
    }

    public Patient findPatientById(long id){
      return  patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(("patient not found")));

    }

    public Patient updatePatient(Integer id, PatientDTO dto){
        Patient patient = findPatientById(id);
        patient.setFirstname(dto.getFirstname());
        patient.setLastname(dto.getLastname());
        patient.setPhone(dto.getPhone());
        patient.setEmail(dto.getEmail());
        patient.setDateOfBirth(dto.getDateOfBirth());
        return patientRepository.save(patient);
    }

    public void deletePatient(long id){
        patientRepository.deleteById(id);
    }

    }





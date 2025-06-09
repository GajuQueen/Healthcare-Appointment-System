package com.example.demo.Patient;

import com.example.demo.Dto.PatientDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/patient")
@RequiredArgsConstructor
public class PatientController {
    private final PatientService patientService;

    @PostMapping("/{id}")
    public ResponseEntity<Patient> createPatient(@PathVariable Integer userId, @RequestBody @Valid PatientDTO dto) {
        Patient patient = patientService.createPatient(userId, dto);
        return new ResponseEntity<>(patient, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Page<Patient>> findByClinicId(@RequestParam Long clinicId, @RequestParam int page, @RequestParam int size){
         Page<Patient> patient= patientService.findByClinicId(clinicId, page,size);
        return new ResponseEntity<>(patient, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patient> findPatientById(@PathVariable Integer id) {
        Patient patient = patientService.findPatientById(id);
        return new ResponseEntity<>(patient, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Patient> updatePatient(@PathVariable Integer id, @RequestBody PatientDTO dto){
        Patient patient =  patientService. updatePatient(id, dto);
        return new ResponseEntity<>(patient, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePatient(Integer id){
        patientService.deletePatient(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

package com.example.demo.Doctor;


import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/doctor")
@RequiredArgsConstructor
public class DoctorController {
    private final DoctorService doctorService;

    @PostMapping
    @Operation(summary = "Create a new doctor")
    public ResponseEntity<Doctor> createDoctor(@RequestBody DoctorDto dto){
        Doctor doctor = doctorService.createDoctor(dto);
        return new ResponseEntity<>(doctor, HttpStatus.CREATED);
    }
    @GetMapping
    @Operation(summary = "Get all doctors, filter by clinic or specialty")
    public ResponseEntity<List<Doctor>> getAllDoctors(@RequestParam Integer clinicId, @RequestParam String speciality){
        List<Doctor> doctor = doctorService.getAllDoctors(clinicId, speciality);
        return new ResponseEntity<>(doctor, HttpStatus.OK);
    }

    @GetMapping("/id")
    @Operation(summary = "Get a doctor by id")
    public ResponseEntity<Doctor> getDoctorById(@RequestParam int id){
        Doctor doctor = doctorService.getDoctorById(id);
        return new ResponseEntity<>(doctor, HttpStatus.OK);
    }

    @PutMapping("/id")
    @Operation(summary = "Update a doctor")
    public ResponseEntity<Doctor> updateDoctor(@PathVariable Integer id, @RequestBody DoctorDto dto){
        Doctor doctor = doctorService.updateDoctor(id, dto);
        return new ResponseEntity<>(doctor, HttpStatus.OK);
    }

    @DeleteMapping("/id")
    @Operation(summary = "Delete a doctor")
    public ResponseEntity<Void> deleteDoctor(@PathVariable Integer id){
        doctorService.deleteDoctor(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

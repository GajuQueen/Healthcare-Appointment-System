package com.example.demo.Clinic;

import com.example.demo.Dto.ClinicDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clinics")
@Tag(name = "clinic controller", description = "create new clinic" )
@RequiredArgsConstructor
@SecurityRequirement(name = "auth")
public class ClinicController {
    private final ClinicService clinicService;
    @PostMapping
    @Operation(
            summary = "Create a clinic"
    )
    public ResponseEntity<ClinicDto> createClinic(@RequestBody @Valid ClinicDto dto){
        Clinic clinic = clinicService.createClinic(dto);
        return new ResponseEntity<>(new ClinicDto(clinic), HttpStatus.CREATED);
    }
    @GetMapping
    @Operation(
            summary = "Get all clinics"
    )
    public ResponseEntity<List<Clinic>> getAllClinics(){
        var clinics = clinicService.getAllClinics();
        return new ResponseEntity<>(clinics, HttpStatus.OK);
    }
    @GetMapping("{id}")
    @Operation(
            summary = "Get clinic by ID"
    )
    public ResponseEntity<Clinic> getClinicById(@RequestBody @Valid long id){
        var clinic = clinicService.getClinicById(id);
        return new ResponseEntity<>(clinic, HttpStatus.OK);
    }
    @PatchMapping("{id}")
    @Operation(
            summary = "Update a clinic"
    )
    public ResponseEntity<Clinic> updateClinic(@PathVariable long id, ClinicDto dto){
        var clinic = clinicService.updateClinic(id, dto);
        return new ResponseEntity<>(clinic, HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteClinicById(@PathVariable long id){
        clinicService.deleteClinicById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}


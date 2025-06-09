package com.example.demo.MedicalRecords;

import com.example.demo.Dto.MedicalRecordDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/medical-records")
@RequiredArgsConstructor
public class MedicalRecordController {

    private final MedicalRecordService medicalRecordService;

    @PostMapping
    public ResponseEntity<MedicalRecord> createMedicalRecord(@RequestBody MedicalRecordDto dto) {
        MedicalRecord created = medicalRecordService.createMedicalRecord(dto, dto.getPatientId(), dto.getDoctorId());
        return ResponseEntity.ok(created);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MedicalRecord> getMedicalRecordById(@PathVariable long id) {
        MedicalRecord record = medicalRecordService.getMedicalRecordById(id);
        return ResponseEntity.ok(record);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MedicalRecord> updateMedicalRecord(@PathVariable long id, @RequestBody MedicalRecordDto dto) {
        MedicalRecord updated = medicalRecordService.updateMedicalRecord(id, dto);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMedicalRecord(@PathVariable long id) {
        medicalRecordService.deleteMedicalRecord(id);
        return ResponseEntity.noContent().build();
    }
}

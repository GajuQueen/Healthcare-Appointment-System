package com.example.demo.MedicalRecords;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/medical-records")
@RequiredArgsConstructor
@PreAuthorize("hasAuthority('ADMIN')")
public class MedicalRecordController {
    private final MedicalRecordRepository medicalRecordRepository;
}

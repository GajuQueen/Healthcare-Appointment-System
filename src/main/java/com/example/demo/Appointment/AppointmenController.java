package com.example.demo.Appointment;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping("/api/Appointment")
@RequiredArgsConstructor
public class AppointmenController {
    private final AppointmentService appointmentService;

    @PostMapping
    @Operation(summary = "Create an appointment")
    public ResponseEntity<Appointment> createAppointment(@RequestBody AppointmentDto dto){
        Appointment appointment = appointmentService.createAppointment(dto);
        return new ResponseEntity<>(appointment, HttpStatus.CREATED);
    }

   @GetMapping
   @Operation(summary = "Get all appointments, filter by patient, doctor, or date.")
    public ResponseEntity<List<Appointment>> findAllAppointment(@RequestParam Long patientid, @RequestParam Long doctorid, @RequestParam LocalDate appointmentDate){
       List<Appointment> appointment = appointmentService.findAllAppointment(patientid, doctorid, appointmentDate);
       return new ResponseEntity<>(appointment, HttpStatus.OK);
   }

   @GetMapping("/id")
    @Operation(summary = " Get an appointment by ID.")
    public ResponseEntity<Appointment> findAppointmentById(@PathVariable Long id){
        Appointment appointment = appointmentService.findAppointmentById(id);
        return new ResponseEntity<>(appointment, HttpStatus.OK);
   }

   @PutMapping("/id")
    @Operation(summary = " Update an appointment")
    public ResponseEntity<Appointment> updateAppointment(@PathVariable Long id, @RequestBody AppointmentDto dto){
        Appointment appointment = appointmentService.updateAppointment(id, dto);
        return new ResponseEntity<>(appointment, HttpStatus.OK);
   }

   @DeleteMapping("/id")
    @Operation(summary = "Delete an appointment")
    public ResponseEntity<Void> deleteAppointment(@PathVariable Long id){
       appointmentService.deleteAppointment(id);
       return new ResponseEntity<>(HttpStatus.OK);
   }
}


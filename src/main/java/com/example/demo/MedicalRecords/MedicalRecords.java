package com.example.demo.MedicalRecords;

import com.example.demo.Common;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MedicalRecords extends Common {
private String no;
}

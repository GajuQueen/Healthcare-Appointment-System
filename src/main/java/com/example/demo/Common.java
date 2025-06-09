package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Common {
    @Id
   private int id;
    @Column(length = 50)
    private String Firstname;
    @Column(length = 50)
    private String Lastname;
    @Column(length = 20)
    private String Phone;
    @Email(message = "Provide a valid email")
    @NotBlank(message = "Email is required")
    @Column(unique = true)
    private String Email;

}

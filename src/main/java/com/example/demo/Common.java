package com.example.demo;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Common {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
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

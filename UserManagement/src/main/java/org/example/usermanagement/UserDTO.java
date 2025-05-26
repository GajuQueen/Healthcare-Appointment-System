package org.example.usermanagement;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private String Firstname;
    private String Lastname;
    private String Role;
    private String Email;
    private String PhoneNumber;

    }

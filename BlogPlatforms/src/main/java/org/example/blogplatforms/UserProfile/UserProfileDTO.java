package org.example.blogplatforms.UserProfile;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserProfileDTO {
    private String bio;
    private LocalDate dob;
    private String full_names;

}

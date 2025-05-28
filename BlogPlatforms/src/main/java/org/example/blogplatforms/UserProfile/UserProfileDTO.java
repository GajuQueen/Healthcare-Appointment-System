package org.example.blogplatforms.UserProfile;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserProfileDTO {
    private String Bio;
    private LocalDate Dob;
    private String Full_names;

}

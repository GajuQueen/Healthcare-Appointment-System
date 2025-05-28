package org.example.blogplatforms.UserProfile;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserProfileController {
    private final UserProfileService userProfileService;

    @PostMapping
    @Operation(summary = "Create a user's profile")
    public UserProfile createUserProfile(@RequestBody UserProfileDTO dto) {
        UserProfile userProfile = new UserProfile();
        userProfile.setFull_names(dto.getFull_names());
        userProfile.setBio(dto.getBio());
        userProfile.setDob(dto.getDob());
        return userProfileService.createUserProfile(userProfile);
    }

    @PutMapping
    @Operation(summary = "update a user's profile")
    public UserProfile updateUserProfile(@PathVariable Long id, @RequestBody UserProfileDTO dto) {
        var userprofile = userProfileService.selectUserProfilebyid(id);
                userprofile.setFull_names(dto.getFull_names());
                userprofile.setBio(dto.getBio());
                userprofile.setDob(dto.getDob());
                return userProfileService.updateUserProfile(id, userprofile);

    }

}

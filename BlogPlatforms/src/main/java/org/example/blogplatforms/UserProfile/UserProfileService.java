package org.example.blogplatforms.UserProfile;

import org.example.blogplatforms.User.User;
import org.example.blogplatforms.User.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService {
    public UserProfileRepository userProfileRepository;
    public UserProfileService(UserProfileRepository userProfileRepository) {
        this.userProfileRepository = userProfileRepository;
    }

    public UserProfile createUserProfile(UserProfile userprofile) {
        return userProfileRepository.save(userprofile);
    }

    public UserProfile selectUserProfilebyid(Long id) {
        return userProfileRepository.findById(id).orElseThrow(()-> new RuntimeException("user not found"));
    }

    public UserProfile updateUserProfile(Long id, UserProfile updatedprofile) {
        var UserProfile = userProfileRepository.findById(id).orElse(null);
        UserProfile.setBio(updatedprofile.getBio());
        UserProfile.setDob(updatedprofile.getDob());
        UserProfile.setFull_names(updatedprofile.getFull_names());
        return userProfileRepository.save(updatedprofile);
    }
}

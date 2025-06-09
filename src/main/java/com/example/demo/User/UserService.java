package com.example.demo.User;

import com.example.demo.Dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class UserService {

    private final BCryptPasswordEncoder passwordEncoder;
    private final UserRepository userRepository;


    public User registerUser(String firstName, String lastName, String email, String rawPassword) {
        String encodedPassword = passwordEncoder.encode(rawPassword);
        User user = new User(firstName, lastName, email, encodedPassword);
        return userRepository.save(user);
    }

    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public boolean checkPassword(String rawPassword, String encodedPassword) {
        return passwordEncoder.matches(rawPassword, encodedPassword);
    }
}

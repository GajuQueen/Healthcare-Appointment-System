package org.example.Student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
private final UserRepository userRepository;
//public UserService(UserRepository userRepository) {
//    this.userRepository = userRepository;
//}
}

package org.example.blogplatforms.User;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userservice {
    private UserRepository userRepository;

    public Userservice(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> selectallusers(){
        return userRepository.findAll();
    }

    public User selectuserbyid(Long id) {
        return userRepository.findById(id).orElseThrow(()-> new RuntimeException("user not found"));
    }

    public User updateUser(Long id,User updatetask) {
        var user = userRepository.findById(id).orElseThrow(()-> new RuntimeException("user not found"));
        user.setUsername(updatetask.getUsername());
        user.setEmail(updatetask.getEmail());
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}

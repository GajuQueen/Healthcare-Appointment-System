package org.example.usermanagement;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User createUser(User user) {
        return repository.save(user);
    }

    public void deleteuser(User user) {
        repository.delete(user);
    }

    public List<User> selectAll() {
        return repository.findAll();
    }

    public User updateTask(Long id , User updatetask) {
        var user =  repository.findById(id).orElseThrow(()-> new RuntimeException("user not found"));
        user.setFirstname(updatetask.getFirstname());
        user.setLastname(updatetask.getLastname());
        user.setRole(updatetask.getRole());
        user.setEmail(updatetask.getEmail());
        user.setPhoneNumber(updatetask.getPhoneNumber());
        return repository.save(user);
    }

}

package org.example.blogplatforms.User;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
@RequiredArgsConstructor
public class Usercontroller {
    private Userservice userservice;

    @PostMapping
    @Operation(summary = "Create a new user")
    public User createUser(@RequestBody UserDTO dto) {
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        return userservice.createUser(user);

    }

    @GetMapping("/{id}")
    @Operation(summary = "Get a user id")
    public List<User> getallusers(User user){
        return userservice.selectallusers();
    }

    @GetMapping("/users")
    @Operation(summary = "Get all users")
    public User getuserbyid(@PathVariable Long id){
        return userservice.selectuserbyid(id);
    }

    @PutMapping("/{id}")
    @Operation(summary =  "Update a user")
    public User updateUser(@PathVariable Long id, @RequestBody UserDTO dto) {
        var user = userservice.selectuserbyid(id);
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        return userservice.createUser(user);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a user")
    public void deleteUser(@PathVariable Long id){
        userservice.deleteUser(id);
    }

}

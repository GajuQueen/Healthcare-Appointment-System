package org.example.usermanagement;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@Tag(name = "user controller",  description = "User management routes")
public class UserController {
    private UserService userService;

    @GetMapping
    @Operation(
            summary = "Return all Users"
    )
    public List<User> getAll() {
        return userService.selectAll();
    }

    @PostMapping
    @Operation(
            summary = "Add a user"
    )

    public User create(@RequestBody UserDTO dto) {
        User user = new User();
        user.setFirstname(dto.getFirstname());
        user.setLastname(dto.getLastname());
        user.setEmail(dto.getEmail());
        user.setPhoneNumber(dto.getPhoneNumber());
        return userService.createUser(user);
    }

    @DeleteMapping("/{id}")
    @Operation(
            summary = "This will delete a user"
    )
    public void delete(@PathVariable User id) {
        userService.deleteuser(id);
    }

    @PutMapping("/{id}")
    @Operation(
            summary = "This will update a user by its id"
    )
    public User update(@PathVariable long id, @RequestBody UserDTO dto) {
        User user = new User();
        user.setFirstname(dto.getFirstname());
        user.setLastname(dto.getLastname());
        user.setEmail(dto.getEmail());
        user.setPhoneNumber(dto.getPhoneNumber());
        return userService.updateTask(id, user);
    }
}


package com.example.demo.User;

import com.example.demo.Common;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "user_table")
@AllArgsConstructor
@NoArgsConstructor
public class User extends Common {
    @NotBlank
    @Schema(required = true, maxLength = 50)
    private String firstName;
    @NotBlank
    @Schema(required = true, maxLength =50)
    private String lastName;
    @NotBlank
    @Schema(required = true, maxLength = 50)
    @Column(unique = true)
    private String email;
    private String password;

}


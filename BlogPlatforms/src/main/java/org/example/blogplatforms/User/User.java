package org.example.blogplatforms.User;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.blogplatforms.Post;
import org.example.blogplatforms.UserProfile.UserProfile;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.security.Timestamp;
import java.util.List;

@Entity
@Table(name = "App_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String Username;

    @Column(unique = true, nullable = false)
    private String Email;

    @CreationTimestamp
    @Column(nullable = false)
    private Timestamp created;

    @UpdateTimestamp
    @Column(nullable = true) //No need since it is setted by default
    private Timestamp updated;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonManagedReference
    private UserProfile userProfile;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Post> posts;




}

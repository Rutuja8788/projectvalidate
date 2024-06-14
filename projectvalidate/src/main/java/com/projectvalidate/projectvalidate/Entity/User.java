package com.projectvalidate.projectvalidate.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users1")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    private String email;

    private String role;
}

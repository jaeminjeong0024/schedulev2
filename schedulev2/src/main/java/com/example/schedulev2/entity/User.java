package com.example.schedulev2.entity;


import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "user")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;

    public User() {

    }


    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }


}


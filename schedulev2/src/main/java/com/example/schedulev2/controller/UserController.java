package com.example.schedulev2.controller;


import com.example.schedulev2.entity.User;
import com.example.schedulev2.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
}

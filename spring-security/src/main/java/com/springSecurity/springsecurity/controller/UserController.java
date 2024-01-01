package com.springSecurity.springsecurity.controller;

import com.springSecurity.springsecurity.entity.User;
import com.springSecurity.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

}

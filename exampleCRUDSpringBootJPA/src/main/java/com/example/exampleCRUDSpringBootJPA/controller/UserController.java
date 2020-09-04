package com.example.exampleCRUDSpringBootJPA.controller;

import com.example.exampleCRUDSpringBootJPA.model.User;
import com.example.exampleCRUDSpringBootJPA.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setName("Caio");
        user.setAge(23);
        users.add(user);

        return users;
    }

    @PostMapping("/user")
    public void addUser(User user) {
        userService.createUser(user);
    }


}

package com.example.exampleCRUDSpringBootJPA.service;

import com.example.exampleCRUDSpringBootJPA.model.User;
import com.example.exampleCRUDSpringBootJPA.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void createUser(User user) {
        userRepository.addUser(user);
    }

}

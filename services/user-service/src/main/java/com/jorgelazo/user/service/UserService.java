package com.jorgelazo.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jorgelazo.user.entity.User;

@Service
public class UserService {

    public List<User> findAll(){
    
        return List.of(
                new User(1L, "John Doe", "john.doe@example.com"),
                new User(2L, "Jane Doe", "jane.doe@example.com")
        );
    }
}

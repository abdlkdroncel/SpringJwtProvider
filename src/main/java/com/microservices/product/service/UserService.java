package com.microservices.product.service;

import com.microservices.product.model.Users;
import com.microservices.product.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Users save(Users users){
        return userRepository.save(users);
    }

    public Users getUser(String username){
        return userRepository.findByUserName(username);
    }
}

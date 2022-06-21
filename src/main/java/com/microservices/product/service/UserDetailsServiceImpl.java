package com.microservices.product.service;

import com.microservices.product.model.Users;
import com.microservices.product.repos.UserRepository;
import com.microservices.product.security.JwtUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userRepository.findByUserName(username);
        return JwtUserDetails.createUserDetail(user);
    }

    public UserDetails loadUserById(Long id) {
        Users user = userRepository.findById(id).get();
        return JwtUserDetails.createUserDetail(user);
    }
}

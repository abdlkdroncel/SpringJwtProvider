package com.microservices.product.repos;

import com.microservices.product.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Users,Long> {

    Users findByUserName(String username);
    Users save(Users users);
}

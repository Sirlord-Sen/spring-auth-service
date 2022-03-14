package com.example.springauthservice.modules.user.repository;

import java.util.UUID;

import com.example.springauthservice.modules.user.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, UUID>{
    
}

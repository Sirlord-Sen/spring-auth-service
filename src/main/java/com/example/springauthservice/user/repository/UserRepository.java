package com.example.springauthservice.user.repository;

import java.util.UUID;

import com.example.springauthservice.user.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, UUID>{
    
}

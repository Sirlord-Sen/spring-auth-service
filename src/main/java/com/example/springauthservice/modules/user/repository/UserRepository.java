package com.example.springauthservice.modules.user.repository;

import java.util.UUID;

import com.example.springauthservice.modules.user.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, UUID>{

    @Query(value = "SELECT u FROM User u WHERE u.email = :email")
    User findByEmail(@Param("email") String email);

}

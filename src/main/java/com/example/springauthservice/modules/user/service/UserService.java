package com.example.springauthservice.modules.user.service;

import com.example.springauthservice.exceptions.custom.NotFoundException;
import com.example.springauthservice.modules.user.dto.requests.RegisterUserDto;
import com.example.springauthservice.modules.user.entity.User;
import com.example.springauthservice.modules.user.repository.UserRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Transactional
    public User signup(RegisterUserDto body){
        User user = modelMapper.map(body, User.class);
        User savedUser = userRepository.save(user);
        return savedUser;
    } 

    public User getUserByEmail(String email){
        User user = userRepository.findByEmail(email);
        if (user == null) throw new NotFoundException("User not fond");
        return user;
    }

    public Boolean validatePassword(String hash, String password){
        char[] pass = password.toCharArray();  
        Argon2 argon = Argon2Factory.create();
        return argon.verify(hash, pass);
    }

}

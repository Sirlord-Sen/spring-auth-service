package com.example.springauthservice.user.service;

import com.example.springauthservice.user.dto.RegisterUserDto;
import com.example.springauthservice.user.entity.User;
import com.example.springauthservice.user.repository.UserRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Transactional
    public User signup(RegisterUserDto body){
        try{User user = modelMapper.map(body, User.class);
        User savedUser = userRepository.save(user);
        return savedUser;}
        catch (Exception e){
            System.out.println(e);
            throw e;
        }
    } 

}

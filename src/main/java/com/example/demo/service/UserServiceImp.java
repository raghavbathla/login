package com.example.demo.service;

import com.example.demo.dto.LoginDto;
import com.example.demo.dto.UserRegistrationDto;
import com.example.demo.model.User;
import com.example.demo.response.responseDto;
import com.example.demo.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class UserServiceImp implements UserService {


    @Autowired
    private UserRepository userRepository;


    @Override
    public String save(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getFullname(), registrationDto.getEmail(), registrationDto.getPassword());
        userRepository.save(user);
        return "Success";

    }

    @Override
    public Long findByPassword(String email,String password) {
        return userRepository.findByPassword(email,password);
    }

}

package com.example.demo.service;

import com.example.demo.dto.LoginDto;
import com.example.demo.dto.UserRegistrationDto;
import com.example.demo.model.User;

import com.example.demo.response.responseDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    String save(UserRegistrationDto registrationDto);
    Long findByPassword(String email,String password);
}

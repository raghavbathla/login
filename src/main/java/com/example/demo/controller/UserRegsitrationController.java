package com.example.demo.controller;


import com.example.demo.dto.UserRegistrationDto;
import com.example.demo.dto.LoginDto;
import com.example.demo.model.User;
import com.example.demo.response.responseDto;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@Controller
@RequestMapping("/registration")
public class UserRegsitrationController {

    @Autowired
private UserService userService;

    public UserRegsitrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/new")
    public String RegisterAccount(/*@ModelAttribute("user")*/ @RequestBody UserRegistrationDto userRegistrationDto){
        return   userService.save(userRegistrationDto);


    }


    @GetMapping("/logindta")
    public List<User> login(@RequestBody LoginDto loginDto) {
     return userService.findByPassword(loginDto.getEmail(), loginDto.getPassword());
    }

    @GetMapping("/check")
public String check(){
        return "Success";
}
}

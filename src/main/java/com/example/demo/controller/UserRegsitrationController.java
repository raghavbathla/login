package com.example.demo.controller;


import com.example.demo.dto.UserRegistrationDto;
import com.example.demo.dto.LoginDto;
import com.example.demo.model.User;
import com.example.demo.response.responseDto;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@Controller
@RequestMapping("/registration")
public class UserRegsitrationController {

    @Autowired
private UserService userService;



    @PostMapping("/new")
    public ResponseEntity<responseDto> addRecord(@RequestBody UserRegistrationDto userRegistrationDto) //throws CustomException
    {
        String status=userService.save(userRegistrationDto);
        responseDto dto = new responseDto("Data added successfully:",status);
        return (new ResponseEntity(dto, HttpStatus.CREATED));
    }



    @PostMapping("/logindta")
    public ResponseEntity<responseDto> login(@RequestBody LoginDto loginDto) {
        responseDto dto = new responseDto("Data added successfully:",userService.findByPassword(loginDto.getEmail(),loginDto.getPassword()));
        return (new ResponseEntity(dto, HttpStatus.CREATED));

    }


}

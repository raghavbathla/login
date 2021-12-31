package com.example.demo.response;


import com.example.demo.dto.UserRegistrationDto;
import com.example.demo.model.User;
import lombok.Data;

@Data
public class responseDto {

    private String message;
    private Object data;

    public responseDto(String message, Object data) {
        this.message = message;
        this.data = data;
    }
}
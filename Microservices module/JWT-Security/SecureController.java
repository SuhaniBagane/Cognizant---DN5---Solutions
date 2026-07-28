package com.cognizant.jwt;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecureController {

    @GetMapping("/hello")

    public String hello(){

        return "JWT Authentication Successful";

    }

}
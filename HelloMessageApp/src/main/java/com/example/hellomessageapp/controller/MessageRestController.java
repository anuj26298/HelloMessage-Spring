package com.example.hellomessageapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/message")
public class MessageRestController {
    @GetMapping("/hello")
    public String helloMessage(){
        return "Hello from Bridgelabz";
    }
}

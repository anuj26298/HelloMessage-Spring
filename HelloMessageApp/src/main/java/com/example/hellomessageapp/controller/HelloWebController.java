package com.example.hellomessageapp.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWebController {
    @GetMapping("/web")
        public String hello(){
            return "hello";
        }
    @GetMapping("/web/message")
    public String message(Model model){
        model.addAttribute("message", "Hello, How are you?");
        return "message";
    }
}

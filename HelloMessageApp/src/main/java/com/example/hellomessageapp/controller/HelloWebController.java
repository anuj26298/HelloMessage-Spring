package com.example.hellomessageapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {
    @GetMapping("/web/message")
    public String message(Model model){
        model.addAttribute("message", "Hello, How are you?");
        return "message";
    }
}

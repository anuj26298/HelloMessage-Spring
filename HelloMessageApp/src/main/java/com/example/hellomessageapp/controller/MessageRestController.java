package com.example.hellomessageapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageRestController {
    @GetMapping("/hello")
    public String helloMessage(){
        return "Hello from Bridgelabz";
    }
    @GetMapping("/helloName")
    public String sayHello(@RequestParam String name){
        return "Hello," + name;
    }

    @GetMapping("/helloName/{name}")
    public String sayHelloUsingPathVariable(@PathVariable String name){
        return "Hello, " + name;
    } 
}

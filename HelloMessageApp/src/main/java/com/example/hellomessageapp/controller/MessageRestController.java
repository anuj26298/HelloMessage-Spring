package com.example.hellomessageapp.controller;

import com.example.hellomessageapp.component.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageRestController {

    @Autowired
    private User user;

    MessageRestController(){

    }

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

    @PostMapping("/hello")
    public String sayHelloBean(@RequestBody User user){
        this.user.firstName = user.firstName;
        this.user.lastName = user.lastName;
        return  "Hello, " + user.firstName + " " + user.lastName;
    }
}

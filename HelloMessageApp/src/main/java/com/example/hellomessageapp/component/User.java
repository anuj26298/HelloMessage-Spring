package com.example.hellomessageapp.component;

import org.springframework.stereotype.Component;

@Component
public class User {
    public String firstName;
    public String lastName;

    User(){

    }

    User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

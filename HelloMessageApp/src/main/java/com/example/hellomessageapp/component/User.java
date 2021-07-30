package com.example.hellomessageapp.component;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String firstName;
    private String lastName;

    User(){

    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

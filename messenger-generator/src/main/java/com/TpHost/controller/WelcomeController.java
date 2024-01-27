package com.TpHost.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    public String welcome(){
        return "welcome to my spring boot web api";
    }
}

package org.launchcode.restauranthub.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/")
    public String helloWorld() {
       return "Hello Spring!";
    }
    @GetMapping("/restricted")
    public String restricted() {
       return "To see this text you need to be logged in!";
    }

}

package org.launchcode.restauranthub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping()
    public String helloWorld() {
       return "Hello Spring!";
    }

//    @GetMapping("/login")                                                                                                                                      ")
//    public String

    @GetMapping("/restricted")
    public String restricted() {
       return "Welcome to Restaurant!";
    }

}

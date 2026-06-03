package com.example.CICD.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String HomePage(){

        return  "This is home page ";
    }

    @GetMapping("/home1")
    public String HomePage1(){

        return  "This is home page1 ";
    }
}

package com.example.CICD.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "CI/CD Working";
    }

    @GetMapping("/home")
    public String home() {
        return "CI/CD Working with change ";
    }
}
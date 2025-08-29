package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${app.message:Hello from default!}")
    private String message;

    @GetMapping("/hello")
    public String hello() {
        return message;
    }
}

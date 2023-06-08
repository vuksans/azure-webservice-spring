package com.example.appservice.azurewebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/info")
public class HomeController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Spring booooot";
    }
}

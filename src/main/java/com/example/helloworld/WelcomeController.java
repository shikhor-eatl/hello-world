package com.example.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeController {
    @RequestMapping("/hello")
    Object sayHello() {
        return "Hello World!!";
    }
}

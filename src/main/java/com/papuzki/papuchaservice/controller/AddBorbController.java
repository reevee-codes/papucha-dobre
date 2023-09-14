package com.papuzki.papuchaservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AddBorbController {
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}

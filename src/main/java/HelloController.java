package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/bonjour/{nom}")
    public String bonjour(@PathVariable String nom) {
        return "Bonjour " + nom;
    }

}

package com.cybersecurity.iam.apilayer.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainAPIController {
    
    @GetMapping("/home")
	public String index() {
		return "Greetings from Spring Booooot!";
	}
}

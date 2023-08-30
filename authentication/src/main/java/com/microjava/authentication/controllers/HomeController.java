package com.microjava.authentication.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
	public String index() {
		return "Authentication services v0.0.1";
	}
}
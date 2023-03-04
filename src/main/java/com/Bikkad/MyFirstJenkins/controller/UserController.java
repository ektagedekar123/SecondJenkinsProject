package com.Bikkad.MyFirstJenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	
	@GetMapping("/Home")
	public String WelcomeHome()
	{
		return "Welcome to Home";
	}

}

package com.jitu.SecureWithCassa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@GetMapping("/")
	public String getAll() {
		return "Hi All";
	}
	
	@GetMapping("/user")
	public String getUser() {
		return "Hi User";
	}
	
	@GetMapping("/admin")
	public String getAdmin() {
		return "Hi Admin";
	}
}

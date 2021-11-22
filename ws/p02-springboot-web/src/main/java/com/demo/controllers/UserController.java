package com.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	
	@GetMapping("/greet")
	public String greet() {
		System.out.println("in greet method");
		return "Welcome user";
	}
	
	@GetMapping("/greet/{name}")
	public String greet(@PathVariable String name) {
		System.out.println("in greet method with arg");
		return "Welcome "+name;
	}
	
}

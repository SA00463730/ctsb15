package com.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// @RestController
@Controller
@RequestMapping("/user")
public class UserController {

	
	@GetMapping("/greet")
	public String greet() {
		System.out.println("in greet method");
		return "welcome";// view name
	}
	
	@GetMapping("/greet/{name}")
	@ResponseBody
	public String greet(@PathVariable String name) {
		System.out.println("in greet method with arg");
		return "Welcome "+name;
	}

	@GetMapping("/friends")
	@ResponseBody
	public List<String> getList() {
		return Arrays.asList("Miley", "Harsha", "Rathish", "Arun");
	}
	

	// 500
	@GetMapping("/first-friends")
	@ResponseBody
	public String getFastFriend() {
		// List<String> names = Arrays.asList("Miley", "Harsha", "Rathish", "Arun");
		List<String> names = null;
		return names.get(0);
	}
	
	// get request -> 405
	@PostMapping("/create")
	@ResponseBody
	public String saveSomeData(){
		return "saved";
	}


// /demo/demo -> 404

	

}

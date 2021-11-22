package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.demo.service.MyService;

@SpringBootApplication
//@ComponentScan({"com.demo.service"})
public class MyApp implements CommandLineRunner {

	@Autowired
	private MyService service;
	
	public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("+++");
		System.out.println("Before shutdown");
		System.out.println(service.greet());
	}
	
}

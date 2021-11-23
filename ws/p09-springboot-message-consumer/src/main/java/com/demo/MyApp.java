package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.api.MessageConvertor;

@SpringBootApplication
public class MyApp implements CommandLineRunner{
	
	@Autowired
	private MessageConvertor convertor;
	
	public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		convertor.translate("I am watching movie");
	}		
}

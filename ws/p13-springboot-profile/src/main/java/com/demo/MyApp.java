package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class MyApp implements CommandLineRunner {

	@Value("${app.name}")
	private String appName;
	
	@Value("${db.name}")
	private String dbName;

	@Autowired
	private Environment env;
	
	public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("AppName: "+appName);
		System.out.println("DbName: "+dbName);

		System.out.println(env.getProperty("JAVA_HOME"));
	}
	
}

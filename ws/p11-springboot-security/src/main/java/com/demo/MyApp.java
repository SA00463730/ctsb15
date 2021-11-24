package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApp {

	public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);
	}
	
}

/*
@Override
protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests()
            .antMatchers("/login", "/register","/home")
            .permitAll()
            .antMatchers("/account/**").hasAnyAuthority("CUSTOMER", "ADMIN")
            .and()
            ...
}
*/

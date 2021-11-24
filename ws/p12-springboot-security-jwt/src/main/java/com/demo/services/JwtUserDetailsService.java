package com.demo.services;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// find user from database
		// find user from file
		// find user from ldap
		// find user from memory
		if ("demo".equals(username)) {
//			return new User("demo", "{noop}demo@123", new ArrayList<>());
			return new User("demo", "$2a$10$yuIUlNq7IOWIqRvyAgQSAOMeKrdEtWk4PHehvgv1CqbQPmDuQ/qI2", new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
}

package com.codingdojo.javatest.services;

import java.util.List;
import java.util.Map;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.codingdojo.javatest.models.User;
import com.codingdojo.javatest.repositories.UserRepository;

@Service
public class UserService {
	
	private UserRepository userRepository;
	private BCryptPasswordEncoder bcrypt;
	
	public UserService(UserRepository userRepository, BCryptPasswordEncoder bcrypt) {
		this.userRepository = userRepository;
		this.bcrypt = bcrypt;
	}
	
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	public List<User> findAll() {
		return (List<User>) userRepository.findAll();
	}
	
	public User create(Map<String, String> body) {
		return userRepository.save(new User(
			body.get("name"),
			body.get("email"),
			bcrypt.encode(body.get("password"))
		));
	}

}
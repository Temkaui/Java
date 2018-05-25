package com.codingdojo.exam.services;

import java.util.Map;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.codingdojo.exam.models.User;
import com.codingdojo.exam.repositories.UserRepository;

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
	
	public User create(Map<String, String> body) {
		return userRepository.save(new User(
			body.get("name"),
			body.get("email"),
			bcrypt.encode(body.get("password"))
		));
	}

}
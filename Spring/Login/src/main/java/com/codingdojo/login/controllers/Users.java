package com.codingdojo.login.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.codingdojo.login.services.UserService;
import com.codingdojo.login.validators.UserValidator;


@Controller
public class Users {
	public UserValidator userValidator;
	private UserService userService;
	
	public Users(UserValidator userValidator, UserService userService) {
		this.userValidator = userValidator;
		this.userService = userService;
	}
	
	@RequestMapping("")
	public String index() {
		return "index";
	}
	@PostMapping("/register")
	public String register(@RequestParam Map<String, String> body, RedirectAttributes flash) {
		HashMap<String, Object> result = userValidator.register(body);
		System.out.println(result);
		if((boolean) result.get("valid")) {
			userService.create(body);
		}
		else {
			flash.addFlashAttribute("errors", result);
		}
		return "redirect:/";
	}
	@PostMapping("/login")
	public String login(@RequestParam Map<String, String> body) {
		System.out.println("hola");
		return "redirect:/";
	}
}

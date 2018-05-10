package com.codingdojo.Portfolio.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Portfolio {
	@RequestMapping("")
	public String Home() {
		return "forward:/index.html";
	}
	
	@RequestMapping("/projects")
	public String Projects() {
		return "forward:/projects.html";
	}
	
	@RequestMapping("/me")
	public String Me() {
		return "forward:/me.html";
	}
}

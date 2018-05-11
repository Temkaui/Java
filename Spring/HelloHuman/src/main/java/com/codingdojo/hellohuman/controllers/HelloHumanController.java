package com.codingdojo.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloHumanController {
	
	@RequestMapping("")
	public String index(@RequestParam(value="firstname", defaultValue="Human") String first, @RequestParam(value="lastname", defaultValue="") String last, Model model) {
		model.addAttribute("first", first);
		model.addAttribute("last", last);
		return "index.jsp";
	}
}

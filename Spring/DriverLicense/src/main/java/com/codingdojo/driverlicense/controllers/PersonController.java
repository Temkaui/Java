package com.codingdojo.driverlicense.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.driverlicense.models.Person;

@Controller
public class PersonController {
	@RequestMapping("")
	public String index(@ModelAttribute("person") Person person) {
		return "index";
	}
   
    @PostMapping("/person/new")
    public String createBook(@Valid @ModelAttribute("person") Person person, BindingResult result) {
        if (result.hasErrors()) {
            return "index";
        }else{
            return "redirect:/license/new";
        }
    }


}

package com.codingdojo.exam.controllers;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.codingdojo.exam.models.Idea;
import com.codingdojo.exam.models.User;
import com.codingdojo.exam.services.IdeaService;
import com.codingdojo.exam.services.UserService;
import com.codingdojo.exam.validators.UserValidator;



@Controller
public class Users {
	
	public UserValidator userValidator;
	private UserService userService;
	private IdeaService ideaService;
	
	
	public Users(UserService userService, UserValidator userValidator, IdeaService ideaservice) {
		this.userService = userService;
		this.userValidator = userValidator;
		this.ideaService = ideaservice;
	}
	
	@RequestMapping("")
	public String index(Model model) {
		model.addAttribute("idea", ideaService.findAll());
		return "index";
	}
	
	
	@PostMapping("login")
	public String login(@RequestParam Map<String, String> body, RedirectAttributes flash, HttpSession session) {
		User user = userValidator.login(body);
		if(user != null) {
			session.setAttribute("user", user);
			return "redirect:/ideas";
		} else {
			flash.addFlashAttribute("error", "Invalid login!");
			return "redirect:/";
		}
	}
	
	@PostMapping("register")
	public String register(@RequestParam Map<String, String> body, RedirectAttributes flash, HttpSession session) {
		HashMap<String, Object> response = userValidator.validate(body);
		if((boolean) response.get("valid")) {
			User user = userService.create(body);
			session.setAttribute("user", user);
			return "redirect:/ideas";
		} 
		else {
			flash.addFlashAttribute("errors", response);
			return "redirect:/";
		}
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		return "redirect:/";
	}
	
	@RequestMapping("/ideas")
	public String allshows(Model model, User user) {
		model.addAttribute("user", userService.findByEmail(user.getEmail()));
		model.addAttribute("ideas", ideaService.findAll());
		return "ideas";
		
	}
	
	@RequestMapping("ideas/new")
	public String newShow(Model model) {			
		model.addAttribute("idea", new Idea());
		return "new";
	}
	
	@PostMapping("ideas/create")
	public String ideas(@Valid @ModelAttribute("idea") Idea idea, Model model, BindingResult result, HttpSession session, RedirectAttributes flash ) {
		User user = (User) session.getAttribute("user");
		idea.setOp(user);
		if(user == null) {
			flash.addFlashAttribute("errors", "You must be logged in first!");
			return "redirect:/";
		}
		if(result.hasErrors()) {
			return "new";
		}
		ideaService.create(idea);
		return "redirect:/ideas";
	}
	
	@RequestMapping("ideas/{id}/edit")
	public String newShow(Model model, @PathVariable("id") Long id) {
		model.addAttribute("idea", ideaService.findOne(id));
		return "edit";
	}
	
	@RequestMapping("ideas/{id}")
	public String show(Model model, @PathVariable("id") Long id) {
		model.addAttribute("idea", ideaService.findOne(id));
		return "idea";
	}
	
	
	@PostMapping("ideas/{id}/edit")
	public String newShow(@Valid @ModelAttribute("idea") Idea idea, BindingResult result, @PathVariable("id") Long id, HttpSession session) {
		User user = (User) session.getAttribute("user");
		idea.setOp(user);
		if(result.hasErrors()) {
			return "edit";
		}
		System.out.println("Here");
		System.out.println(idea.getId());

		ideaService.update(idea);
		return "redirect:/ideas";
	}
	
	@PostMapping("/ideas/{id}/like")
	public String Liking(@ModelAttribute("idea") Idea idea, HttpSession session, @PathVariable("id") Long id, BindingResult result) {
		User user = (User) session.getAttribute("user");
		idea.setOp(user);
		idea.setIdeaname(idea.getIdeaname());
		idea.setLiking(idea.getLiking()+1);
		ideaService.update(idea);
		return "redirect:/ideas";
	}
//	
//	
//	
//	@PostMapping("shows/{id}/rating")
//	public String rating(@Valid @ModelAttribute("rating") Rating rating, BindingResult result, Model model, @PathVariable("id") Long id, HttpSession session, RedirectAttributes flash) {
//		System.out.println(rating.getRate());
//		User user = (User) session.getAttribute("user");
//		if(user == null) {
//			flash.addFlashAttribute("errors", "You must be logged in first!");
//			return "redirect:/";
//		}
//		if(result.hasErrors()) {
//			model.addAttribute("show", showService.findOne(id));
//			return String.format("redirect:/shows/%d/rating", id);
//		}
//		Show sh = showService.findOne(id);
//		List<Rating> ratings = sh.getRatings();
//		for(Rating rat: ratings) {
//			if(rat.getUser().getId() == user.getId()) {
//				flash.addFlashAttribute("errors", "You have already left a rating!");
//				return String.format("redirect:/shows/%d", id);
//			}
//		}
//		System.out.println(rating.getRate());
//		rating.setId(null);
//		ratingService.create(rating);
//		ratings = sh.getRatings();
//		Double sum = 0.0;
//		for(Rating rat: ratings) {
//			sum += rat.getRate();
//		}
//		System.out.println(sum);
//		sh.setAvgRating(sum/ratings.size());
//		showService.update(sh);
//		return "redirect:/shows";
//	}
	
}
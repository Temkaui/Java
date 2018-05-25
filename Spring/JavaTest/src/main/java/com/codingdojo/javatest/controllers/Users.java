package com.codingdojo.javatest.controllers;

import java.util.HashMap;
import java.util.List;
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

import com.codingdojo.javatest.models.Rating;
import com.codingdojo.javatest.models.Show;
import com.codingdojo.javatest.models.User;
import com.codingdojo.javatest.services.RatingService;
import com.codingdojo.javatest.services.ShowService;
import com.codingdojo.javatest.services.UserService;
import com.codingdojo.javatest.validators.UserValidator;

@Controller
public class Users {
	
	public UserValidator userValidator;
	private UserService userService;
	private ShowService showService;
	private RatingService ratingService;
	
	public Users(UserService userService, UserValidator userValidator, ShowService showservice, RatingService ratingService) {
		this.userService = userService;
		this.userValidator = userValidator;
		this.showService = showservice;
		this.ratingService = ratingService;
	}
	
	@RequestMapping("")
	public String index(Model model) {
		model.addAttribute("shows", showService.findAll());
		return "index";
	}
	
	
	@PostMapping("login")
	public String login(@RequestParam Map<String, String> body, RedirectAttributes flash, HttpSession session) {
		User user = userValidator.login(body);
		if(user != null) {
			session.setAttribute("user", user);
			return "redirect:/shows";
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
			return "redirect:/shows";
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
	
	@RequestMapping("/shows")
	public String allshows(Model model, User user) {
		model.addAttribute("user", userService.findByEmail(user.getEmail()));
		model.addAttribute("shows", showService.findAll());
		return "showall";
		
	}
	
	@RequestMapping("shows/new")
	public String newShow(Model model) {			
		model.addAttribute("show", new Show());
		return "new";
	}
	
	@PostMapping("shows/create")
	public String shows(@Valid @ModelAttribute("show") Show show, BindingResult result) {
		System.out.println(show.getCreator().getName());
		System.out.println(show.getShowname());
		if(result.hasErrors()) {
			return "new";
		}
		showService.create(show);
		return "redirect:/shows";
	}
	
	@RequestMapping("shows/{id}/edit")
	public String newShow(Model model, @PathVariable("id") Long id) {
		model.addAttribute("show", showService.findOne(id));
		return "edit";
	}
	
	@PostMapping("shows/{id}/edit")
	public String newShow(@Valid @ModelAttribute("show") Show show, BindingResult result, @PathVariable("id") Long id) {
		if(result.hasErrors()) {
			return "edit";
		}
		System.out.println("Here");
		System.out.println(show.getId());
		
		showService.update(show);
		return "redirect:/shows";
	}
	
	@RequestMapping("shows/{id}")
	public String show(Model model, @PathVariable("id") Long id) {
		model.addAttribute("show", showService.findOne(id));
		model.addAttribute("rating", new Rating());
		return "shows";
	}
	
	@PostMapping("shows/{id}/rating")
	public String rating(@Valid @ModelAttribute("rating") Rating rating, BindingResult result, Model model, @PathVariable("id") Long id, HttpSession session, RedirectAttributes flash) {
		System.out.println(rating.getRate());
		User user = (User) session.getAttribute("user");
		if(user == null) {
			flash.addFlashAttribute("errors", "You must be logged in first!");
			return "redirect:/";
		}
		if(result.hasErrors()) {
			model.addAttribute("show", showService.findOne(id));
			return String.format("redirect:/shows/%d/rating", id);
		}
		Show sh = showService.findOne(id);
		List<Rating> ratings = sh.getRatings();
		for(Rating rat: ratings) {
			if(rat.getUser().getId() == user.getId()) {
				flash.addFlashAttribute("errors", "You have already left a rating!");
				return String.format("redirect:/shows/%d", id);
			}
		}
		System.out.println(rating.getRate());
		rating.setId(null);
		ratingService.create(rating);
		ratings = sh.getRatings();
		Double sum = 0.0;
		for(Rating rat: ratings) {
			sum += rat.getRate();
		}
		System.out.println(sum);
		sh.setAvgRating(sum/ratings.size());
		showService.update(sh);
		return "redirect:/shows";
	}
	
}
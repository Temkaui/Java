package com.codingdojo.Date.controllers;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {
	@RequestMapping ("")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping ("/date")
	public String date( Model model) {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("EEE, 'the' dd 'of' MMMM, yyyy");
		model.addAttribute("date", formatter.format(date));
		System.out.println(date);
		return "date.jsp";
	}
	
	@RequestMapping ("/time")
	public String time(Model model) {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a");
		model.addAttribute("time", formatter.format(date));
		System.out.println(date);
		return "time.jsp";
	}
}

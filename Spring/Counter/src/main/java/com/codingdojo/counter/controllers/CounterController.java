package com.codingdojo.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	@RequestMapping("")
	public String index(HttpSession session) {
		if(session.getAttribute("count") == null){
			session.setAttribute("count",0);
		}
		else{
			session.setAttribute("count",(Integer) session.getAttribute("count")+1);
		}
		System.out.println("hello");
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter() {
		System.out.println("hello counter");
		return "counter.jsp";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("count",0);
		return "redirect:/counter";
	}

	
}

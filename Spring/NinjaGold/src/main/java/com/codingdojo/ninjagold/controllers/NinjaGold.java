package com.codingdojo.ninjagold.controllers;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NinjaGold {
	
	@RequestMapping("")
	public String index( HttpSession session) {
		if(session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
			session.setAttribute("res", "");
		}
		return "index";
	}
	
	@RequestMapping("farm")
	public String farm(HttpSession session, Random rand ) {
		String r="You entered a ";
		int g=0;
		rand = new Random();
		g=rand.nextInt(10)+10;
		r += "farm earned a " + g;
		session.setAttribute("gold",(Integer) session.getAttribute("gold")+g);
		session.setAttribute("res", (String) session.getAttribute("res")+r+"\n");
		return "redirect:/";
	}
	
	
	@RequestMapping("cave")
	public String cave(HttpSession session, Random rand ) {
		String r="You entered a ";
		int g=0;
		rand = new Random();
		g=rand.nextInt(5)+5;
		r += "farm earned a " + g;
		session.setAttribute("gold",(Integer) session.getAttribute("gold")+g);
		session.setAttribute("res", (String) session.getAttribute("res")+r+"\n");
		
		return "redirect:/";
	}

	@RequestMapping("house")
	public String house(HttpSession session, Random rand ) {
		String r="You entered a ";
		int g=0;
		rand = new Random();
		g=rand.nextInt(3)+2;
		r += "farm earned a " + g;
		session.setAttribute("gold",(Integer) session.getAttribute("gold")+g);
		session.setAttribute("res", (String) session.getAttribute("res")+r+"\n");
		
		return "redirect:/";
	}
	
	@RequestMapping("casino")
	public String casino(HttpSession session, Random rand ) {
		String r="You entered a ";
		int g=0;
		rand = new Random();
		g=rand.nextInt(100)-50;
		r += "farm earned a " + g;
		session.setAttribute("gold",(Integer) session.getAttribute("gold")+g);
		session.setAttribute("res", (String) session.getAttribute("res")+r+"\n");
		
		return "redirect:/";
	}
	
	@RequestMapping("/clear")
	public String clear(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}

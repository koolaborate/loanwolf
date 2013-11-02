package com.koolaborate.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class LoginController {
 
	@RequestMapping({"/login"})
	public String showLogin(ModelMap model) {
		System.out.println("inside");
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "login";
	}
	
	@RequestMapping({"/demo"})
	public String showDemo(ModelMap model) {
		System.out.println("inside");
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "demo";
	}
 
}
package com.koolaborate.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class LoginController {
 
	@RequestMapping({"/","/welcome"})
	public String printWelcome(ModelMap model) {
		System.out.println("inside");
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "login";
 
	}
 
}
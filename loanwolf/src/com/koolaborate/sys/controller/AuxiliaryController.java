package com.koolaborate.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuxiliaryController {

	@RequestMapping({"/samples"})
	public String getTemplates(ModelMap modelMap){
		modelMap.addAttribute("message", "Samples Page");
		return "sample";
	}
	
	@RequestMapping({"/createlead"})
	public String showTilesEx(ModelMap model) {
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "createleadform";
	}
	
}

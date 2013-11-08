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
}

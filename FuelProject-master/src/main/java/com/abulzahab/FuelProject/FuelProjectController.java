package com.abulzahab.FuelProject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FuelProjectController {

	@RequestMapping(value = {"/","/index","/home",""} , method = RequestMethod.GET)
	public String getHome(Model model) {
		String name = "Abdulrahman";
		
		model.addAttribute("nn", name);
		return "index";
	}
}

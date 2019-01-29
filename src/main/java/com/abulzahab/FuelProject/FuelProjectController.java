package com.abulzahab.FuelProject;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.abulzahab.FuelProject.model.Address;
import com.abulzahab.FuelProject.model.Citizen;
import com.abulzahab.FuelProject.services.AddressService;
import com.abulzahab.FuelProject.services.CitizenService;

@Controller
public class FuelProjectController {
	
	List<Address> addresses = AddressService.getAddresses();

	@RequestMapping(value = {"/","/index","/home",""} , method = RequestMethod.GET)
	public String getHome(Model model) {
		String name = "Abdulrahman";
		
		model.addAttribute("nn", name);
		return "index";
	}
	
	@RequestMapping (value = "/register" , method = RequestMethod.GET)
	public String getRegistrationForm(Model model) {
		model.addAttribute("adds",addresses);
		return "addcitizen";
	}
	
	@RequestMapping (value = "/registercitizen" , method = RequestMethod.POST)
	public String addCitizen(Citizen citizen) {
		CitizenService.allCitizens.add(citizen);
		
		return "success";
	}
	
	
}

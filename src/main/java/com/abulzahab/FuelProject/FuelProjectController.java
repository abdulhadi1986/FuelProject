package com.abulzahab.FuelProject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.abulzahab.FuelProject.model.Address;
import com.abulzahab.FuelProject.model.Citizen;
import com.abulzahab.FuelProject.model.DistributionVehicle;
import com.abulzahab.FuelProject.model.FuelRequest;
import com.abulzahab.FuelProject.model.FuelStation;
import com.abulzahab.FuelProject.model.Operator;
import com.abulzahab.FuelProject.services.AddressService;
import com.abulzahab.FuelProject.services.CitizenService;
import com.abulzahab.FuelProject.services.OperatorService;
import com.abulzahab.FuelProject.services.RequestService;
import com.abulzahab.FuelProject.services.StationService;
import com.abulzahab.FuelProject.services.VehicleService;



@Controller
public class FuelProjectController {
	
	List<Address> addresses = AddressService.getAddresses();
    List<FuelStation> stations = StationService.getAllStation();
    List<FuelRequest> requests = RequestService.getAllRequests();
    
    Citizen citizen;
    Operator operator;
    		
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
		
		citizen.setUserName(citizen.getNationalNo());
		citizen.setPassword(citizen.getIdNumber());
		citizen = citizen;
		CitizenService.allCitizens.add(citizen);
		
		return "success";
	}
	
	
	
	
//---------------------------------------------------------------
	
	
	
	@RequestMapping (value = "/station" , method = RequestMethod.GET)
	public String getAddStation(Model model) {
		model.addAttribute("adds", addresses);
		
		return "station";
	
	}
	
	
	@RequestMapping(value = "/addstation" , method = RequestMethod.POST) 
	public String addStation(FuelStation station) {
		StationService.allStation.add(station);
		
		
		return "success";
		
	}
		
	
	
	//----------------------------------------------------------
	
	
	@RequestMapping (value ="/operator" , method = RequestMethod.GET)
	public String getRegisterOperator(Model model) {
		model.addAttribute("addsta", stations);
		
		
		return "operator";
	}
		
		
	@RequestMapping (value ="/addoperator" , method = RequestMethod.POST)
	public String addOperator(Operator operator) {
		
		operator = operator;
		
		OperatorService.allOperator.add(operator);
		
		System.out.println(OperatorService.allOperator);
	return "success";	
	}
	
	
	
	//-----------------------------------------------------------------
	
	@RequestMapping (value ="/vehicle" , method = RequestMethod.GET)
	public String getaddvehicle(Model model) {
		model.addAttribute("addsta", stations);
		
		return "vehicle";
	}
	
	
	@RequestMapping (value ="/addvehicle" , method = RequestMethod.POST)
	public String addVehicle (DistributionVehicle vehicle) {
	VehicleService.allVehicles.add(vehicle);
	System.out.println(VehicleService.allVehicles);
		
		return "success";
	}
	
	//-----------------------------------
	
	@RequestMapping (value="/operatorhome" , method = RequestMethod.GET)
	public String getRequests(Model model, 
							@RequestParam(value="stId", required=false, defaultValue="0")	int stationId ) {
		
		
		model.addAttribute("allRequests", requests);
		return "operatorhome";
	}
	
	
	
	//-------------------------------------
	
	@RequestMapping(value ="/fuelrequest" , method = RequestMethod.GET)
	public String getFuelRequest(Model model) {
		model.addAttribute("addsta", stations);
		model.addAttribute("adds", addresses);
		return"fuelrequest";
	}
	
	
	
	@RequestMapping( value="/addfuelrequest" , method = RequestMethod.POST)
	public String addFuelRequest(FuelRequest request, int stationId) {
		
		for (int i=1; i<StationService.allStation.size(); i++) {
			if(StationService.allStation.get(i).getStationId() == stationId) {
				request.setFuelStation(StationService.allStation.get(i));
			}
		}
		request.setSubmitionDate(LocalDate.now());
		request.setSubmittedBy(citizen);
		
		RequestService.allRequests.add(request);
		
		
		return"success";
	}
	
}

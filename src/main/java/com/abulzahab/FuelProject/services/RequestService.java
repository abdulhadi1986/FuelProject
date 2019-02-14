package com.abulzahab.FuelProject.services;

import java.util.ArrayList;
import java.util.List;

import com.abulzahab.FuelProject.model.FuelRequest;

public class RequestService {
	
	public static List<FuelRequest> allRequests= new ArrayList<FuelRequest>();

	public static List<FuelRequest> getAllRequests() {
		return allRequests;
	}

	public static void setAllRequests(List<FuelRequest> allRequests) {
		RequestService.allRequests = allRequests;
	}
	
	

}

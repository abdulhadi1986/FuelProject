package com.abulzahab.FuelProject.model;

import java.util.List;



public class Operator extends User {

	
	@Override
	public String toString() {
		return "Operator [fuelStation=" + fuelStation + ", approvedFuelRequests=" + approvedFuelRequests + "]";
	}

	private FuelStation fuelStation; 
	
	private List<FuelRequest> approvedFuelRequests;

	public FuelStation getFuelStation() {
		return fuelStation;
	}

	public void setFuelStation(FuelStation fuelStation) {
		this.fuelStation = fuelStation;
	}

	public List<FuelRequest> getApprovedFuelRequests() {
		return approvedFuelRequests;
	}

	public void setApprovedFuelRequests(List<FuelRequest> approvedFuelRequests) {
		this.approvedFuelRequests = approvedFuelRequests;
	}

	
	
	

}

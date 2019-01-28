package FuelProject.model;

import java.util.List;


public class Citizen extends User {
	
	
private Address cityAddress;
	
	private String street;
	private String building; 
	private List<FuelRequest> submittedFuelRequests;
	
	
	public Address getCityAddress() {
		return cityAddress;
	}
	public void setCityAddress(Address cityAddress) {
		this.cityAddress = cityAddress;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public List<FuelRequest> getSubmittedFuelRequests() {
		return submittedFuelRequests;
	}
	public void setSubmittedFuelRequests(List<FuelRequest> submittedFuelRequests) {
		this.submittedFuelRequests = submittedFuelRequests;
	}

	
	
	
	
	
	
	
}

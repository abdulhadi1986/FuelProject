package com.abulzahab.FuelProject.model;

public class Address {
	
	private int addressId;
	private String city;
	private String area;
	
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	
	public Address() {
		
	}
	
	public Address(int addressId, String city, String area) {
		this.setAddressId(addressId);
		this.setCity(city);
		this.setArea(area);
	}
	
	
	

}

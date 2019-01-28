package FuelProject.model;

import java.util.List;




public class Address {
	
	private int addressId;
	private String city;
	private String area;
	private List<Citizen> citizens;
	private List<FuelStation> fuelStations;
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
	public List<Citizen> getCitizens() {
		return citizens;
	}
	public void setCitizens(List<Citizen> citizens) {
		this.citizens = citizens;
	}
	public List<FuelStation> getFuelStations() {
		return fuelStations;
	}
	public void setFuelStations(List<FuelStation> fuelStations) {
		this.fuelStations = fuelStations;
	}
	
	
	
	

}

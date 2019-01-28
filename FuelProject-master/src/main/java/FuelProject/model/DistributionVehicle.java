package FuelProject.model;

import java.util.List;



public class DistributionVehicle {
	
	private int vehicleId;
	private String plateNo;
	private double tankCapacity;
	private String driverName;
	private String driverMobileNo;
	private FuelStation fuelStation;
	private List<FuelRequest> assignedFuelRequests;
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getPlateNo() {
		return plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public double getTankCapacity() {
		return tankCapacity;
	}
	public void setTankCapacity(double tankCapacity) {
		this.tankCapacity = tankCapacity;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDriverMobileNo() {
		return driverMobileNo;
	}
	public void setDriverMobileNo(String driverMobileNo) {
		this.driverMobileNo = driverMobileNo;
	}
	public FuelStation getFuelStation() {
		return fuelStation;
	}
	public void setFuelStation(FuelStation fuelStation) {
		this.fuelStation = fuelStation;
	}
	public List<FuelRequest> getAssignedFuelRequests() {
		return assignedFuelRequests;
	}
	public void setAssignedFuelRequests(List<FuelRequest> assignedFuelRequests) {
		this.assignedFuelRequests = assignedFuelRequests;
	}
	
	
	
	
	
	
	

}

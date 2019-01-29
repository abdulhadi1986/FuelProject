package com.abulzahab.FuelProject.model;

import java.util.List;


public class FuelStation {

	private int stationId;
	private String stationName;
	private String telNo;
	private Address cityAddress;
	private double tankCapacity;
	private Operator operator;
	private List<DistributionVehicle> distributionVehicles;
	private List<FuelRequest> assignedRequests;
	public int getStationId() {
		return stationId;
	}
	public void setStationId(int stationId) {
		this.stationId = stationId;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	public Address getCityAddress() {
		return cityAddress;
	}
	public void setCityAddress(Address cityAddress) {
		this.cityAddress = cityAddress;
	}
	public double getTankCapacity() {
		return tankCapacity;
	}
	public void setTankCapacity(double tankCapacity) {
		this.tankCapacity = tankCapacity;
	}
	public Operator getOperator() {
		return operator;
	}
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	public List<DistributionVehicle> getDistributionVehicles() {
		return distributionVehicles;
	}
	public void setDistributionVehicles(List<DistributionVehicle> distributionVehicles) {
		this.distributionVehicles = distributionVehicles;
	}
	public List<FuelRequest> getAssignedRequests() {
		return assignedRequests;
	}
	public void setAssignedRequests(List<FuelRequest> assignedRequests) {
		this.assignedRequests = assignedRequests;
	}
	
	
	
	
	
	
}

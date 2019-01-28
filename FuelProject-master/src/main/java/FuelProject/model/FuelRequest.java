package FuelProject.model;

import java.time.LocalDate;




public class FuelRequest {

	private int RequestId;
	private double amount;
    private FuelStation fuelStation;
	private LocalDate submitionDate ;
	private LocalDate preferedDeliveryDate;
    private Operator approvedBy;
	private String Status;
	private boolean approved;
	private String comments;
	private DistributionVehicle distributionVehicle;
	public int getRequestId() {
		return RequestId;
	}
	public void setRequestId(int requestId) {
		RequestId = requestId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public FuelStation getFuelStation() {
		return fuelStation;
	}
	public void setFuelStation(FuelStation fuelStation) {
		this.fuelStation = fuelStation;
	}
	public LocalDate getSubmitionDate() {
		return submitionDate;
	}
	public void setSubmitionDate(LocalDate submitionDate) {
		this.submitionDate = submitionDate;
	}
	public LocalDate getPreferedDeliveryDate() {
		return preferedDeliveryDate;
	}
	public void setPreferedDeliveryDate(LocalDate preferedDeliveryDate) {
		this.preferedDeliveryDate = preferedDeliveryDate;
	}
	public Operator getApprovedBy() {
		return approvedBy;
	}
	public void setApprovedBy(Operator approvedBy) {
		this.approvedBy = approvedBy;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public DistributionVehicle getDistributionVehicle() {
		return distributionVehicle;
	}
	public void setDistributionVehicle(DistributionVehicle distributionVehicle) {
		this.distributionVehicle = distributionVehicle;
	}
	
	
	
	
	
}

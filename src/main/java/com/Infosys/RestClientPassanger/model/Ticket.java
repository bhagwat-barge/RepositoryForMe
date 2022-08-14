package com.Infosys.RestClientPassanger.model;


public class Ticket {

	private Integer trainNo;
	private Integer pnr;
	private String status;
	private double price;
	private String trainName;
	
	
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	
	
	public Integer getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(Integer trainNo) {
		this.trainNo = trainNo;
	}
	public Integer getPnr() {
		return pnr;
	}
	public void setPnr(Integer pnr) {
		this.pnr = pnr;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Ticket [trainNo=" + trainNo + ", pnr=" + pnr + ", status=" + status + ", price=" + price
				+ ", trainName=" + trainName + "]";
	}
}

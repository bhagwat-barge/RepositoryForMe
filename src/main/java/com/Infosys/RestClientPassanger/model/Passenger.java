package com.Infosys.RestClientPassanger.model;

public class Passenger {

	private Integer trainNo;
	public Integer getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(Integer trainNo) {
		this.trainNo = trainNo;
	}
	private String fname;
	private String lname;
	private String doj;
	private String from;
	private String to;
	private Ticket ticket;
	
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	@Override
	public String toString() {
		return "Passenger [trainNo=" + trainNo + ", fname=" + fname + ", lname=" + lname + ", doj=" + doj + ", from="
				+ from + ", to=" + to + ", ticket=" + ticket + "]";
	}
}

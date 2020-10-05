package com.revature.models;

public class Apartment {
	private int id;
	private String buildingLetter;
	private int roomNumber;
	private double monthlyRent;
	
	public Apartment( String buildingLetter, int roomNumber, double MonthlyRent ) {
		this.setBuildingLetter(buildingLetter);
		this.setRoomNumber(roomNumber);
		this.setMonthlyRent(monthlyRent);
	}
	
	public int getId() {
		return id;
	}
	public String getbuildingLetter() {
		return buildingLetter;
	}
	public void setBuildingLetter(String buildingLetter) {
		this.buildingLetter = buildingLetter;
	}
	public int getroomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public double getMonthlyRent() {
		return monthlyRent;
	}
	public void setMonthlyRent(double monthlyRent) {
		this.monthlyRent = monthlyRent;
	}
}


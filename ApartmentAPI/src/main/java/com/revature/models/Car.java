package com.revature.models;

public class Car {
	private int carId;
	private String make;
	private String model;
	private int year;
	private int license;
	private Resident resident;
	
	public Car(int carId, String make, String model, int year, int license, Resident resident) {
		this.setMake(make);
	}

	public int getCarId() {
		return carId;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getLicense() {
		return license;
	}

	public void setLicense(int license) {
		this.license = license;
	}

	public Resident getResident() {
		return resident;
	}

	public void setResident(Resident resident) {
		this.resident = resident;
	}
}

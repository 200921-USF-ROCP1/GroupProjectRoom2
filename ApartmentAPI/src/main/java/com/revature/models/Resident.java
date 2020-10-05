package com.revature.models;

public class Resident {
	//private static int inc = 0;
	private int id;
	private String first_name;
	private String last_name;
	private int apartment_id;
	
	public Resident(int iD,String fname,String lname, int aptID) {
		//id = ++inc;
		id = iD;
		first_name = fname;
		last_name = lname;
		apartment_id = aptID;
	}
	
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return first_name;
	}
	public void setFirstName(String name) {
		first_name = name;
	}
	public String getLastName() {
		return last_name;
	}
	public void setLastName(String name) {
		last_name = name;
	}
	public int getApartment_id() {
		return apartment_id;
	}
	public void setApartment_id(int iD) {
		apartment_id = iD;
	}
}

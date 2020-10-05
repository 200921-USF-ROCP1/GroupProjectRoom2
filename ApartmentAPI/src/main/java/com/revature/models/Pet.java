package com.revature.models;

public class Pet {
	
	private int id;
	private String breed;
	private String name;
	private int apartment_id;
	private int is_service_animal;
	
	
	public Pet(int id, String buildingnumber, int room_number, int montthly_rent)
	{
		this.id = 0;
		this.breed = "";
		this.name = "";
		this.apartment_id = 0;
		this.is_service_animal = 0;
		
	}
	public Pet()
	{
		
	}


	public int getId() {
		return id;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getApartment_id() {
		return apartment_id;
	}
	public void setApartment_id(int apartment_id) {
		this.apartment_id = apartment_id;
	}
	public int getIs_service_animal() {
		return is_service_animal;
	}
	public void setIs_service_animal(int is_service_animal) {
		this.is_service_animal = is_service_animal;
	}


//	public void setId(int id) {
//		this.id = id;
//	}


	

}

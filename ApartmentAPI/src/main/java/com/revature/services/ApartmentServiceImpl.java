package com.revature.services;

import java.util.Scanner;

import com.revature.app.App;
import com.revature.dao.ApartmentDAO;
import com.revature.interfaces.ApartmentService;

public class ApartmentServiceImpl implements ApartmentService{
	private Scanner sc = App.sc;
	private ApartmentDAO aDAO = new ApartmentDAO();

	public void getEmptyApartments() {
		aDAO.getVacantApatments();

	}

	public void getApartmentPets() {
		aDAO.getVacantApatments();
	}

	public void getIncome() {
		// TODO Auto-generated method stub
		
	}

	public void getEmptyApartments() {
		// TODO Auto-generated method stub
		
	}

	public void getApartmentPets() {
		// TODO Auto-generated method stub
		
	}

	public void getIncome() {
		// TODO Auto-generated method stub
		
	}

}

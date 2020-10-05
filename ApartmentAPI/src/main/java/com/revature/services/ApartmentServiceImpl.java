package com.revature.services;

import java.util.Scanner;

import com.revature.app.App;
import com.revature.dao.ApartmentDAO;
import com.revature.interfaces.ApartmentService;
import com.revature.interfaces.DAO;

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

}

package com.revature.services;

import java.util.Scanner;

import com.revature.app.App;
import com.revature.dao.ApartmentDAO;
import com.revature.dao.ResidentDAO;
import com.revature.interfaces.ApartmentService;

public class ApartmentServiceImpl implements ApartmentService{
	private Scanner sc = App.sc;
	private ApartmentDAO aDAO = new ApartmentDAO();
	private ResidentDAO rDAO = new ResidentDAO();

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

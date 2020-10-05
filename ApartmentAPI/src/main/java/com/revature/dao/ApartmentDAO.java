package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.interfaces.DAO;
import com.revature.models.Apartment;
import com.revature.services.ConnectionService;

public class ApartmentDAO implements DAO<Apartment>{
	PreparedStatement ps;
	ResultSet rs;
	Connection connection;

	public ApartmentDAO() { //constructor
		connection = ConnectionService.getConnection();
	}
	
	public void create(Apartment t) throws SQLException {
		ps = connection.prepareStatement("insert into apartments(building_letter,room_number,monthly_rent) values (?,?,?)");
		ps.setString(1, t.getbuildingLetter());
		ps.setInt(2, t.getroomNumber());
		ps.setDouble(3, t.getMonthlyRent());
		
		ps.execute();
		
	}

	public Apartment retrieve(int id) {
		return null;
	}
	public void getVacantApatments() {
		
	}
	
	public void getApatmentsWithPets() {
		
	}
	
	public double getAllRent() {
		return (Double) null;
		
	}

	public Apartment update(Apartment t) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}

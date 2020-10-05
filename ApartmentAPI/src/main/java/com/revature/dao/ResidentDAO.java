package com.revature.dao;

import com.revature.interfaces.DAO;
import com.revature.models.Resident;

public class ResidentDAO implements DAO<Resident> {
	PreparedStatement ps;
	ResultSet rs;
	Connection connection;
	
	public residentDAO() { //constructor
		connection = ConnectionService.getConnection();
	}
	
	public void create(Resident t) {
		ps = connection.prepareStatement("insert into resident(iD,fname,lname,aptID) values (?,?,?,?)");
		ps.setInt(1, t.getId());
		ps.setString(2, t.getFirstName());
		ps.setString(3, t.getLastName());
		ps.setInt(4, t.getApartment_id())
		
		ps.execute();
		
		
	}

	public Resident retrieve(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

	public Resident update(Resident t) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
}

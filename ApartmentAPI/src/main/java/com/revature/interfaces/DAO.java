package com.revature.interfaces;

import java.sql.SQLException;

public interface DAO<T> {
	
	//create
	public void create(T t) throws SQLException;
	
	//retrieve
	public T retrieve(int id) throws SQLException;
	
	//update
	public T update(T t) throws SQLException;
	
	//delete
	public void delete(int id) throws SQLException;
}

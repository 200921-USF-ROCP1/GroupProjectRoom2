package com.revature.interfaces;

public interface DAOInterface<T> {
	
	//create
	public void create(T t);
	
	//retrieve
	public T retrieve(int id);
	
	//update
	public T update(T t);
	
	//delete
	public void delete(int id);
}

package com.app.dao;

import java.util.List;

import com.app.entity.Customer;

public interface customerDAO {
public List<Customer> getCustomer();
	
	public void saveCustomer(Customer theCustomer);
	
	public Customer getCustomer(int theID);
}

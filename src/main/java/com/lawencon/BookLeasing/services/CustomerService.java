package com.lawencon.BookLeasing.services;

import java.util.List;

import com.lawencon.BookLeasing.dto.CustomerDto;
import com.lawencon.BookLeasing.model.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();
	
	public void saveCustomer (Customer customer);
	
	public Customer getCustomer(int id);
	
	public void deleteCustomer(int id);

	public Customer saveCustomer(CustomerDto customerDto);
}

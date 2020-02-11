package com.lawencon.BookLeasing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lawencon.BookLeasing.dao.CustomerRepository;
import com.lawencon.BookLeasing.dto.CustomerDto;
import com.lawencon.BookLeasing.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	@Autowired
	private CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	@Override
	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public void saveCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	@Override
	public Customer getCustomer(int id) {
		return customerRepository.getOne(id);
	}

	@Override
	public void deleteCustomer(int id) {
		customerRepository.deleteById(id);
	}

	@Override
	public Customer saveCustomer(CustomerDto customerDto) {
		Customer customer = new Customer();
		customer.setName(customerDto.getName());
		return customerRepository.save(customer);
	}

}

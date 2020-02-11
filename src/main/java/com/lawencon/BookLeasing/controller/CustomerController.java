package com.lawencon.BookLeasing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lawencon.BookLeasing.dto.CustomerDto;
import com.lawencon.BookLeasing.model.Customer;
import com.lawencon.BookLeasing.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	private CustomerService customerService;

	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@GetMapping
	public List<Customer> getAllCustomer() {
		return customerService.getCustomers();
	}
	
	@GetMapping("/{id}")
	public Customer getCustomer(int id) {
		return customerService.getCustomer(id);
	}
	
	@PostMapping
	public Customer create(CustomerDto customerName) {
		return customerService.saveCustomer(customerName);
	}

	@PutMapping("/{id}")
	public Customer store(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
		return customer;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") int id) {
		customerService.deleteCustomer(id);
	}
}

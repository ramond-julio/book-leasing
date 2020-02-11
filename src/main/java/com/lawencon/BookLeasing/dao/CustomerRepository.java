package com.lawencon.BookLeasing.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lawencon.BookLeasing.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}

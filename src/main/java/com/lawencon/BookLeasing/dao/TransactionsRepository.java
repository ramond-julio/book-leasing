package com.lawencon.BookLeasing.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lawencon.BookLeasing.model.Transactions;

public interface TransactionsRepository extends JpaRepository<Transactions, Integer>{

}

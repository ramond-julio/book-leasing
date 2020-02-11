package com.lawencon.BookLeasing.services;

import java.util.List;

import com.lawencon.BookLeasing.dto.TransactionsDto;
import com.lawencon.BookLeasing.model.Transactions;

public interface TransactionsService {

	public List<Transactions> getTransactions();
	
	public void saveTransactions(Transactions transactions);
	
	public Transactions getTransactions(int id);
	
	public void deleteTransactions(int id);

	public Transactions saveTransactions(TransactionsDto transactionsDto);
}

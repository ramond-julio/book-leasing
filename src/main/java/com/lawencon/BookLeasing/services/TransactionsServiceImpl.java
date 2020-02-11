package com.lawencon.BookLeasing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lawencon.BookLeasing.dao.TransactionsRepository;
import com.lawencon.BookLeasing.dto.TransactionsDto;
import com.lawencon.BookLeasing.model.Transactions;

@Service
public class TransactionsServiceImpl implements TransactionsService {

	private TransactionsRepository transactionsRepository;
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	public TransactionsServiceImpl(TransactionsRepository transactionsRepository) {
		this.transactionsRepository = transactionsRepository;
	}
	
	@Override
	public List<Transactions> getTransactions() {
		return transactionsRepository.findAll();
	}

	@Override
	public void saveTransactions(Transactions transactions) {
		transactionsRepository.save(transactions);

	}

	@Override
	public Transactions getTransactions(int id) {
		return transactionsRepository.getOne(id);
	}

	@Override
	public void deleteTransactions(int id) {
		transactionsRepository.deleteById(id);
	}

	@Override
	public Transactions saveTransactions(TransactionsDto transactionsDto) {
		Transactions transactions = new Transactions();
		transactions.setBorrowTime(transactionsDto.getBorrowTime());
		transactions.setStartDate(transactionsDto.getStartDate());
		transactions.setEndDate(transactionsDto.getEndDate());
		transactions.setPenaltiesTime(transactionsDto.getPenaltiesTime());
		transactions.setPenalties(transactionsDto.getPenalties());
		transactions.setBook(bookService.getBook(transactionsDto.getBookId()));
		transactions.setCustomer(customerService.getCustomer(transactionsDto.getCustomerId()));
		return transactionsRepository.save(transactions);
	}

}

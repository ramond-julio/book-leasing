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

import com.lawencon.BookLeasing.dto.TransactionsDto;
import com.lawencon.BookLeasing.model.Transactions;
import com.lawencon.BookLeasing.services.TransactionsService;

@RestController
@RequestMapping("/transactions")
public class TransactionsController {

	private TransactionsService transactionsService;

	@Autowired
	public TransactionsController(TransactionsService transactionsService) {
		this.transactionsService = transactionsService;
	}
	
	@GetMapping("/transactions")
	public List<Transactions> getAlTransactions() {
		return transactionsService.getTransactions();
	}
	
	@GetMapping("/{id}")
	public Transactions getTransactions(int id) {
		return transactionsService.getTransactions(id);
	}
	
	@PostMapping
	public Transactions create(@RequestBody TransactionsDto transactionsDto) {
		return transactionsService.saveTransactions(transactionsDto);
	}
	
	@PutMapping("/transactions/{id}")
	public Transactions store(@RequestBody Transactions transactions) {
		transactionsService.saveTransactions(transactions);
		return transactions;
	}
	
	@DeleteMapping("/transactions/{id}")
	public void delete(@PathVariable("id") int id) {
		transactionsService.deleteTransactions(id);
	}
}

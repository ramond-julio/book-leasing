package com.lawencon.BookLeasing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lawencon.BookLeasing.dao.BookRepository;
import com.lawencon.BookLeasing.dto.BookDto;
import com.lawencon.BookLeasing.model.Book;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository bookRepository;
	
	@Autowired
	private BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	@Override
	public List<Book> getBooks() {
		return bookRepository.findAll();
	}

	@Override
	public void saveBook(Book book) {
		bookRepository.save(book);
	}

	@Override
	public Book getBook(int id) {
		return bookRepository.getOne(id);
	}

	@Override
	public void deleteBook(int id) {
		bookRepository.deleteById(id);
	}

	@Override
	public Book saveBook(BookDto bookDto) {
		Book book = new Book();
		book.setName(bookDto.getName());
		book.setQuantity(bookDto.getQuantity());
		return bookRepository.save(book);
	}
}

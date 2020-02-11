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

import com.lawencon.BookLeasing.dto.BookDto;
import com.lawencon.BookLeasing.model.Book;
import com.lawencon.BookLeasing.services.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

	private BookService bookService;

	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping
	public List<Book> getAllBooks() {
		return bookService.getBooks();
	}
	
	@GetMapping("/{id}")
	public Book getBook(int id) {
		return bookService.getBook(id);
	}
	
	@PostMapping
	public Book create(@RequestBody BookDto bookDto) {
		return bookService.saveBook(bookDto);
	}
	
	@PutMapping("/{id}")
	public Book update(@RequestBody Book book) {
		bookService.saveBook(book);
		return book;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") int id) {
		bookService.deleteBook(id);
	}
}

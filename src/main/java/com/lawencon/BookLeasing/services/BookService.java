package com.lawencon.BookLeasing.services;

import java.util.List;

import com.lawencon.BookLeasing.dto.BookDto;
import com.lawencon.BookLeasing.model.Book;

public interface BookService {

	public List<Book> getBooks();
	
	public void saveBook (Book book);
	
	public Book getBook (int id);
	
	public void deleteBook (int id);

	public Book saveBook(BookDto bookDto);
}

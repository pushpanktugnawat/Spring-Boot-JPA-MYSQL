/*
 *  Copyright (c) 2020 Andree Hagelstein, Maik Schulze, Deutsche Telekom AG. All Rights Reserved.
 *  
 *  Filename: BookApiRestImpl.java
 */
package com.push.app.springboot.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.push.app.springboot.model.Book;
import com.push.app.springboot.service.IBookService;

/**
 * The Class BookApiRestImpl.
 *
 * @author pintu
 */
@RestController
public class BookApiRestImpl {
	
	@Autowired
	private IBookService bookService;
	
	/**
	 * Gets the all books.
	 *
	 * @return the all books
	 */
	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		return bookService.getAllBooks();
	}
	
	/**
	 * Adds the book.
	 *
	 * @param book the book
	 * @return the string
	 */
	@PostMapping("/books")
	public String addBook(@RequestBody Book book)
	{
		return bookService.addBook(book);
	}
	
	/**
	 * Gets the book by id.
	 *
	 * @param id the id
	 * @return the book by id
	 */
	@GetMapping("/books/{id}")
	public Book getBookById(@PathVariable int id)
	{
		return bookService.getAllBookById(id);
	}
	
	/**
	 * Adds the book.
	 *
	 * @param book the book
	 * @return the string
	 */
	@PutMapping("/books")
	public String updateBook(@RequestBody Book book)
	{
		return bookService.update(book);
	}

}

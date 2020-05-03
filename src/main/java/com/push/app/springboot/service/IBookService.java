/*
 *  Copyright (c) 2020 Andree Hagelstein, Maik Schulze, Deutsche Telekom AG. All Rights Reserved.
 *  
 *  Filename: IBookService.java
 */
package com.push.app.springboot.service;

import java.util.List;

import com.push.app.springboot.model.Book;

// TODO: Auto-generated Javadoc
/**
 * The Interface IBookService.
 *
 * @author pintu
 */
public interface IBookService {
	
	/**
	 * Gets the all books.
	 *
	 * @return the all books
	 */
	public List<Book> getAllBooks();

	/**
	 * Adds the book.
	 *
	 * @param book the book
	 * @return the string
	 */
	String addBook(Book book);

	/**
	 * Gets the all book by id.
	 *
	 * @param id the id
	 * @return the all book by id
	 */
	Book getAllBookById(int id);

	/**
	 * @param book
	 * @return
	 */
	String update(Book book);

	/**
	 * Delete book.
	 *
	 * @param id the id
	 * @return the string
	 */
	String deleteBook(int id);

}

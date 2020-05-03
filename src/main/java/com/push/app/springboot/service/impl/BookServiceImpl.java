/*
 *  Copyright (c) 2020 Andree Hagelstein, Maik Schulze, Deutsche Telekom AG. All Rights Reserved.
 *  
 *  Filename: BookServiceImpl.java
 */
package com.push.app.springboot.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.push.app.springboot.dao.IBookDao;
import com.push.app.springboot.model.Book;
import com.push.app.springboot.service.IBookService;
import com.push.app.springboot.utils.MessageUtils;

/**
 * The Class BookServiceImpl.
 *
 * @author pintu
 */
@Service
public class BookServiceImpl implements IBookService{
	
	private List<Book> books=new ArrayList<>(Arrays.asList(new Book(1, "The Wedding", "Nicholas Sparks", "102514575A55", 500)
			,new Book(2, "The Notebook", "Nicholas Sparks", "102514575A58", 500)));

	@Autowired
	private IBookDao bookDao;
	
	/* (non-Javadoc)
	 * @see com.push.app.springboot.service.IBookService#getAllBooks()
	 */
	@Override
	public List<Book> getAllBooks() {
		
		/**
		 * If without DB want to check once go ahead by uncomment this line and comment other line
		 * return books;*/
		
		List<Book> allBooks=new ArrayList<>();
		
		bookDao.findAll().forEach(allBooks :: add);
		return allBooks;
	}
	
	/* (non-Javadoc)
	 * @see com.push.app.springboot.service.IBookService#addBook(com.push.app.springboot.model.Book)
	 */
	@Override
	public String addBook(Book book) {
		
		/**
		 * If without DB want to check once go ahead by uncomment this line and comment other line
			books.add(book);
		*/	
		bookDao.save(book);
		return MessageUtils.BOOK_ADDED_SUCCESSFULLY;
	}
	
	/* (non-Javadoc)
	 * @see com.push.app.springboot.service.IBookService#getAllBookById(int)
	 */
	@Override
	public Book getAllBookById(int id) {
		
		/**
		 * If without DB want to check once go ahead by uncomment this line and comment other line
			return books.stream().filter(b -> b.getId()==id).findFirst().get();
		*/
		return bookDao.findById(id).get();
		
	}
	
	/* (non-Javadoc)
	 * @see com.push.app.springboot.service.IBookService#update(com.push.app.springboot.model.Book)
	 */
	@Override
	public String update(Book book) {
		
		/**
		 * If without DB want to check once go ahead by uncomment this line and comment other line
			books.add(book);
		*/	
		bookDao.save(book);
		return MessageUtils.BOOK_UPDATED_SUCCESSFULLY;
	}
	
	/* (non-Javadoc)
	 * @see com.push.app.springboot.service.IBookService#deleteBook(int)
	 */
	@Override
	public String deleteBook(int id)
	{
		bookDao.deleteById(id);
		return MessageUtils.BOOK_DELETED_SUCCESSFULLY;
	}
	
	

}

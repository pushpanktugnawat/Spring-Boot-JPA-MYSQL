/**
 * 
 */
package com.push.app.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.push.app.springboot.model.Book;

/**
 * @author pintu
 *
 */
public interface IBookDao extends CrudRepository<Book,Integer>
{
	
}

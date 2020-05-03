/*
 *  Copyright (c) 2020 Andree Hagelstein, Maik Schulze, Deutsche Telekom AG. All Rights Reserved.
 *  
 *  Filename: UsersApiRestImpl.java
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

import com.push.app.springboot.model.Users;
import com.push.app.springboot.service.IUsersService;

/**
 * The Class UsersApiRestImpl.
 *
 * @author pintu
 */
@RestController
public class UsersApiRestImpl {
	
	@Autowired
	private IUsersService usersService;
	
	/**
	 * Gets the all Users.
	 *
	 * @return the all Users
	 */
	@GetMapping("/users")
	public List<Users> getAllUsers()
	{
		return usersService.getAllUsers();
	}
	
	/**
	 * Adds the Users.
	 *
	 * @param Users the Users
	 * @return the string
	 */
	@PostMapping("/users")
	public String addUsers(@RequestBody Users users)
	{
		return usersService.addUsers(users);
	}
	
	/**
	 * update the Users.
	 *
	 * @param Users the Users
	 * @return the string
	 */
	@PutMapping("/users")
	public String updateUsers(@RequestBody Users users)
	{
		return usersService.update(users);
	}

}

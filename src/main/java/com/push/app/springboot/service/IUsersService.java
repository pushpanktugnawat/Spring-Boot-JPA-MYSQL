/**
 * 
 */
package com.push.app.springboot.service;
import java.util.List;

import com.push.app.springboot.model.Users;

/**
 * @author pintu
 *
 */
public interface IUsersService {
	/**
	 * Gets the all users.
	 *
	 * @return the all users
	 */
	public List<Users> getAllUsers();

	/**
	 * Adds the user.
	 *
	 * @param users the user
	 * @return the string
	 */
	String addUsers(Users users);
	
	/**
	 * update the user.
	 *
	 * @param user the user
	 * @return the string
	 */
	String update(Users users);

}

package com.push.app.springboot.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.push.app.springboot.dao.IUsersDao;
import com.push.app.springboot.model.Users;
import com.push.app.springboot.service.IUsersService;
import com.push.app.springboot.utils.MessageUtils;

@Service
public class UsersServiceImpl implements IUsersService{

	@Autowired
	private IUsersDao usersDao;
	
	@Override
	public List<Users> getAllUsers() {
		
		
		List<Users> allUsers=new ArrayList<>();
		
		usersDao.findAll().forEach(allUsers :: add);
		return allUsers;
	}
	
	/* (non-Javadoc)
	 * @see com.push.app.springboot.service.IUsersService#addUsers(com.push.app.springboot.model.Users)
	 */
	@Override
	public String addUsers(Users users) {
		
		usersDao.save(users);
		return MessageUtils.USER_ADDED_SUCCESSFULLY;
	}
	
	/* (non-Javadoc)
	 * @see com.push.app.springboot.service.IUsersService#update(com.push.app.springboot.model.Users)
	 */
	@Override
	public String update(Users users) {
		
		usersDao.save(users);
		return MessageUtils.USER_UPDATED_SUCCESSFULLY;
	}
	
	
}

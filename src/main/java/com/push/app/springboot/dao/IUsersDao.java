package com.push.app.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.push.app.springboot.model.Users;

public interface IUsersDao extends CrudRepository<Users,Integer>{

}

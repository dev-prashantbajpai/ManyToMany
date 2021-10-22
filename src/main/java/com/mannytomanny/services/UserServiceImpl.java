package com.mannytomanny.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mannytomanny.dao.UserDao;
import com.mannytomanny.entities.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserDao userDao;

	@Override
	public User addUser(User user) {
		return this.userDao.save(user);
	}

	@Override
	public List<User> getUsers() {
		return this.userDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public User getUser(Long id) {
		return this.userDao.getOne(id);
	}
	
}

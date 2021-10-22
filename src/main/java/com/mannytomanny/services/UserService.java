package com.mannytomanny.services;

import java.util.List;

import com.mannytomanny.entities.User;

public interface UserService {

	public User addUser(User user);

	public List<User> getUsers();

	public User getUser(Long id);

}

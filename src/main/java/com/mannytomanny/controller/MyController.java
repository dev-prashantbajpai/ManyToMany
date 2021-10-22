package com.mannytomanny.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mannytomanny.entities.User;
import com.mannytomanny.services.UserService;

@RestController
public class MyController {

	@Autowired
	public UserService userService;
	
	@PostMapping("/user/create")
	public User addUser(@RequestBody User user) {
		return this.userService.addUser(user);
	}
	
	@GetMapping("/user/get_all")
	public List<User> getUsers(){
		return this.userService.getUsers();
	}
	
	@GetMapping("/user/get/{id}")
	public User getUser(@PathVariable Long id) {
		return this.userService.getUser(id);
	}
	
}

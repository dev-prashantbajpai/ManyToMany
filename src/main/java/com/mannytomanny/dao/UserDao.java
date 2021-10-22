package com.mannytomanny.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mannytomanny.entities.User;

public interface UserDao extends JpaRepository<User, Long> {

}

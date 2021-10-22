package com.mannytomanny.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mannytomanny.entities.Address;

public interface AddressDao extends JpaRepository<Address, Long> {

}

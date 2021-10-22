package com.mannytomanny.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mannytomanny.dao.AddressDao;
import com.mannytomanny.entities.Address;

@Service
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	public AddressDao addressDao;

	@Override
	public Address addAddress(Address address) {
		return this.addressDao.save(address);
	}

	@Override
	public List<Address> getAddresses() {
		return this.addressDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Address getAddress(Long id) {
		return this.addressDao.getOne(id);
	}

}

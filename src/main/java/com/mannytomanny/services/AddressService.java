package com.mannytomanny.services;

import java.util.List;

import com.mannytomanny.entities.Address;

public interface AddressService {

	public Address addAddress(Address address);

	public List<Address> getAddresses();

	public Address getAddress(Long id);

}

package com.mannytomanny.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mannytomanny.entities.Address;
import com.mannytomanny.services.AddressService;

@RestController
public class AddressController {
	
	@Autowired
	public AddressService addressService;
	
	@PostMapping("/address/create")
	public Address addAddress(@RequestBody Address address) {
		return this.addressService.addAddress(address);
	}
	
	@GetMapping("/address/get_all")
	public List<Address> getAddresses(){
		return this.addressService.getAddresses();
	}
	
	@GetMapping("/address/get/{id}")
	public Address getAddress(@PathVariable Long id) {
		return this.addressService.getAddress(id);
	}

}

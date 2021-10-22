package com.mannytomanny.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "tAddress")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String houseNumber;
	private String street;
	private String city;
	private Long pincode;
	
    @ManyToMany(targetEntity = User.class, cascade = CascadeType.ALL)
//    @JoinTable(
//            name = "User_Add",
//            joinColumns = @JoinColumn(
//                    name = "PROJ_ID"
//            ),
//            inverseJoinColumns = @JoinColumn(
//                    name = "TASK_ID"
//            )
//    )
	@JsonIgnoreProperties("address")
	private List<User> users;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Address(Long id, String houseNumber, String street, String city, Long pincode, List<User> users) {
		super();
		this.id = id;
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
		this.users = users;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", houseNumber=" + houseNumber + ", street=" + street + ", city=" + city
				+ ", pincode=" + pincode + ", users=" + users + "]";
	} 
}

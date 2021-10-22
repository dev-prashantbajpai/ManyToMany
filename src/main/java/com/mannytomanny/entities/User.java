package com.mannytomanny.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tUser")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String mobile;
	private String email;
	/*
	 * If the association is bidirectional, one side has to be the owner and one side has to be the inverse end (ie. it will be ignored when updating the relationship values in the association table):

So, the side which has the mappedBy attribute is the inverse side. The side which doesn't have the mappedBy attribute is the owner.

The owner side is the side which Hibernate looks at to know which association exists. So, for example, if you add a Foo in the set of foos of a Bar, 
a new row will be inserted by Hibernate in the join table. If, on the contrary, you add a Bar to the set of bars of a Foo, nothing will be modified in the database.
	 */
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "users")
	@JsonIgnoreProperties("users")
	private List<Address> address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public User(Long id, String name, String mobile, String email, List<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", address=" + address
				+ "]";
	} 
}

package com.avizva.model;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {

	@Size(min = 3, max = 20)
	private String name;
	@NotEmpty
	@Pattern(regexp = "[a-zA-Z0-9]+@.[a-z]{3}")
	private String email;
	private String contact;
	private List<String> hobbies;
	@Past
	private Date dob;
	// private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	// public Address getAddress() {
	// return address;
	// }
	//
	// public void setAddress(Address address) {
	// this.address = address;
	// }

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", contact=" + contact + "]";
	}

}

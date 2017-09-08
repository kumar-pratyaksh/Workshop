package com.avizva.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class User {

	@NotEmpty
	@Pattern(regexp = "[a-zA-Z]+")
	private String name;

	@NotEmpty
	// @Pattern(regexp = "[a-zA-Z0-9._]*@{1}.[a-z]{2,3}")
	private String email;

	@NotEmpty
	@Pattern(regexp = "[789]{1}[0-9]{9}")
	private String contact;

	private String gender;

	private String password;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", contact=" + contact + ", gender=" + gender + ", password="
				+ password + "]";
	}

}

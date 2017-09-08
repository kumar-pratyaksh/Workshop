package com.avizva.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class UserDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4426560104765572333L;
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

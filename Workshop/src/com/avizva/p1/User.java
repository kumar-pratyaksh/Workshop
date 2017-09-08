package com.avizva.p1;

public class User {

	private String username;
	private String password;

	public User() {
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public void display() {
		System.out.println("Username : " + username + ", Password : " + password);
	}

}

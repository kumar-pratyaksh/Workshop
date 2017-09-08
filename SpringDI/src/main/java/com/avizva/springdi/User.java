package com.avizva.springdi;

public class User {

	
	private int userId;
	private String userName;
	public User(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + "]";
	}
	
	
}

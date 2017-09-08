package com.avizva.spring;

public class User {

	private int userId;
	private String userName;

	public User() {
	}

	public User(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + "]";
	}

}

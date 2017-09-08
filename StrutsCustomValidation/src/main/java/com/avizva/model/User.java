package com.avizva.model;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Validateable;

public class User extends ActionSupport implements Validateable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void validate() {
		// TODO Auto-generated method stub
		if (userName.length() < 1)
			addFieldError("userName", "Provide valid username");
		if (password.length() < 5)
			addFieldError("password", "Provide valid password");
	}

	public String execute() throws Exception {
		return SUCCESS;
	}

}

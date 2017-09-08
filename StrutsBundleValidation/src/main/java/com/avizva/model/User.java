package com.avizva.model;

import com.opensymphony.xwork2.ActionSupport;

public class User extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String url;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String password) {
		this.url = password;
	}

	public String execute() throws Exception {
		return SUCCESS;
	}

}

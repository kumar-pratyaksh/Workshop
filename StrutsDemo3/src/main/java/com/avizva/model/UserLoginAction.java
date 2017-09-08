package com.avizva.model;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.avizva.dao.UserDao;
import com.opensymphony.xwork2.ActionSupport;

public class UserLoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6112393205961373696L;

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

	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		String userName = (String) request.getAttribute("userName");
		String password = (String) request.getAttribute("password");
		UserDao userDao = new UserDao();
		if (userDao.validateUser(userName, password)) {
			return "SUCCESS";

		} else {
			return "FAILURE";
		}
	}

}

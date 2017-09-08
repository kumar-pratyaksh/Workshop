package com.avizva.model;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.avizva.dao.UserDao;
import com.opensymphony.xwork2.Action;

public class UserLoginAction implements Action, SessionAware {

	private String userName;
	private String password;

	SessionMap<String, Object> sessionMap;

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

	public String execute() throws Exception {
		UserDao dao = new UserDao();
		if (dao.validateUser(userName, password)) {
			sessionMap.put("userName", userName);
			return "success";
		} else
			return "failure";
	}

	public String logout() {
		if (sessionMap != null) {
			sessionMap.invalidate();
		}
		return "loggedOut";
	}

	public String display() {
		return "none";
	}

	public String isLoggedIn() {
		if (sessionMap.get("userName") != null) {
			return "loggedIn";
		} else {
			return "loggedOut";
		}
	}

	public void setSession(Map<String, Object> session) {
		sessionMap = (SessionMap<String, Object>) session;
	}

}

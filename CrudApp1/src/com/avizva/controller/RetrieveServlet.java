package com.avizva.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.avizva.model.User;

/**
 * Servlet implementation class RetrieveServlet
 */
public class RetrieveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("userName");
		User user = new User();
		user = user.getUser(userName);
		if (user == null) {
			System.out.println("User not found");
		} else {
			System.out.println(user);
		}
	}

}

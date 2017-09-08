package com.avizva.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.avizva.model.User;

/**
 * Servlet implementation class CreateServlet
 */
public class CreateServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");

		User user = new User();
		if (user.insertUser(userName, password, email, contact))
			response.sendRedirect("success.html");
		else
			response.sendRedirect("error.html");
	}

}

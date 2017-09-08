package com.avizva.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.avizva.model.UserAuth;

/**
 * Servlet implementation class AuthServlet
 */
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("loadUser");
		UserAuth userAuth = new UserAuth();
		boolean validate = userAuth.authorizeUser(request.getParameter("userName"), request.getParameter("password"));
		if (validate)
			requestDispatcher.forward(request, response);
		else {
			response.getWriter().println("<font color='red'>Invalid Credentials</font>");
			requestDispatcher = request.getRequestDispatcher("index.html");
			requestDispatcher.include(request, response);
		}
	}

}

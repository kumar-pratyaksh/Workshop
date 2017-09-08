package com.avizva.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.avizva.model.User;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/updatePassword")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		User user = new User();
		if (user.updateUser(userName, password))
			response.getWriter().println("Password updated");
		else
			response.getWriter().println("User not found");
	}

}

package com.avizva.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.avizva.model.User;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/deleteUser")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("userName");
		User user = new User();
		if (user.deleteUser(userName))
			response.getWriter().println("User deleted");
		else {
			response.getWriter().println("Error while deleting user");
		}
	}

}

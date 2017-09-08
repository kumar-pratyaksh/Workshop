package com.avizva;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String email = req.getParameter("email");
		PrintWriter writer = resp.getWriter();
		resp.setContentType("text/html");
		writer.println("name:" + username + " email:" + email);
		writer.println("<a href='servlet2?username=" + username + "'>click here for another servlet</a>");
		Cookie cookie = new Cookie("username", username);
		resp.addCookie(cookie);
	}
}

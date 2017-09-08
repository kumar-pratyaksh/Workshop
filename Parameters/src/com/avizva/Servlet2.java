package com.avizva;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ServletContext context = getServletContext();
		// String string = context.getInitParameter("username");
		// resp.getWriter().println(string);
		// ServletConfig config = getServletConfig();
		// resp.getWriter().println(config.getInitParameter("filetype"));
		// resp.getWriter().println(getServletContext().getAttribute("abc"));
		// HttpSession session = req.getSession(false);
		// System.out.println(session);
		// resp.getWriter().println(session.getAttribute("xyz"));
		resp.getWriter().println(req.getParameter("uname"));
	}
}

package com.avizva;

import java.io.IOException;

import javax.servlet.ServletException;
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
		// ServletContext context = getServletContext();
		// String string = context.getInitParameter("username");
		// resp.getWriter().println(string);
		// ServletConfig config = getServletConfig();
		// resp.getWriter().println(config.getInitParameter("filetype"));
		// resp.getWriter().println(context.getAttribute("abc"));
		// HttpSession session = req.getSession();
		// session.setAttribute("xyz", "abc");

		String username = req.getParameter("username");
		String contact = req.getParameter("contact");
		resp.setContentType("text/html");
		resp.getWriter().println("<br> User name is " + username);
		resp.getWriter().println("<br>Contact is " + contact);
		resp.getWriter().println("<form action='Servlet2' method='POST'>");
		resp.getWriter().println("<input type='hidden' value='hidden value' name='uname'>");
		resp.getWriter().println("<input type='submit'>");
		resp.getWriter().println("</form>");

	}

}

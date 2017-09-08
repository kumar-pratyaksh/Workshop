package com.avizva;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {

	private static final long serialVersionUID = -7949320343916269855L;

	@Override
	public void init(ServletConfig config) throws ServletException {
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter printWriter = resp.getWriter();
		// resp.getOutputStream() is used for writing binary data
		// resp.getWriter() is used for writing text
		// servlet sends response in form of html
		System.out.println(req.getParameter("message"));
		printWriter.println(req.getParameter("message"));
		printWriter.println("Hello world!!!!!!!!");
		printWriter.close();
	}

	@Override
	public void destroy() {
	}

}

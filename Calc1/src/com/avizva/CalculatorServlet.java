package com.avizva;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String stringA = req.getParameter("a");
		String stringB = req.getParameter("b");
		int a = 0;
		int b = 0;

		if (!"".equals(stringA)) {
			a = Integer.parseInt(stringA);
		}
		if (!"".equals(stringB)) {
			b = Integer.parseInt(stringB);
		}
		String result = "Result =";
		if (req.getParameter("add") != null) {
			result += (a + b);
		} else if (req.getParameter("subtract") != null) {
			result += (a - b);
		} else if (req.getParameter("multiply") != null) {
			result += (a * b);
		} else {
			if (b == 0)
				result += "Infinity";
			else
				result += (a / b);
		}
		PrintWriter printWriter = resp.getWriter();
		printWriter.write(result);

		printWriter.close();
	}

	@Override
	public void destroy() {
		super.destroy();
	}

}

package com;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class DecryptDataFilter
 */
@WebFilter("/DecryptDataFilter")
public class DecryptDataFilter implements Filter {

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		String message = request.getParameter("message");
		System.out.println("Recieved message:" + message);
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < message.length(); i++) {
			builder.append((char) (message.charAt(i) - 1));
		}
		request.setAttribute("message", builder.toString());
		chain.doFilter(request, response);
	}

}

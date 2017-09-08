package com.avizva.model;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class MyInterceptor implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7387322175256424522L;

	public void destroy() {
		System.out.println("Destroyer method");

	}

	public void init() {

		System.out.println("Initializer called");
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		ValueStack valueStack = invocation.getStack();
		String message = valueStack.findString("message");
		System.out.println(message);
		valueStack.set("message", message.toUpperCase());
		return invocation.invoke();
	}

}

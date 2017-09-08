package com.avizva;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class DecryptionInterceptor implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8272680523606076587L;

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void init() {
		// TODO Auto-generated method stub

	}

	public String intercept(ActionInvocation invocation) throws Exception {
		ValueStack valueStack = invocation.getStack();
		String encryptedText = valueStack.findString("text");
		System.out.println("Encrypted text:" + encryptedText);
		String text = "";
		for (int i = 0; i < encryptedText.length(); i++) {
			text += (char) (encryptedText.charAt(i) - 1);
		}
		valueStack.set("text", text);
		valueStack.set("encText", encryptedText);
		return invocation.invoke();
	}

}

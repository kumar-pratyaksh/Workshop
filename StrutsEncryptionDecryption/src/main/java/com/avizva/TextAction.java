package com.avizva;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.Action;

public class TextAction implements Action {

	private String text;

	private String encText;

	private List<String> webframeworks = new ArrayList<String>();

	public TextAction() {
		webframeworks.add("Spring MVC");
		webframeworks.add("Struts 1.x");
		webframeworks.add("Struts 2.x");
		webframeworks.add("JavaServer Faces (JSF)");
		webframeworks.add("Google Web Toolkit (GWT)");
		webframeworks.add("Apache Wicket");
		webframeworks.add("Apache Click");
		webframeworks.add("Apache Cocoon");
		webframeworks.add("JBoss Seam");
		webframeworks.add("Stripes");
		webframeworks.add("Apache Tapestry");
		webframeworks.add("Others");
	}

	public List<String> getWebframeworks() {
		return webframeworks;
	}

	public void setWebframeworks(List<String> webframeworks) {
		this.webframeworks = webframeworks;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getEncText() {
		return encText;
	}

	public void setEncText(String encText) {
		this.encText = encText;
	}

	public String execute() throws Exception {
		System.out.println("Decrypted text:" + text);
		System.out.println("ENcrypted text:" + encText);
		return SUCCESS;
	}

	public String showDojo() {
		return SUCCESS;
	}

}

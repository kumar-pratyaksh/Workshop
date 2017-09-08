package com.avizva.spring.model;

import com.avizva.spring.annotation.Loggable;

public class Employee {

	private String name;

	public String getName() {
		return name;
	}

	@Loggable
	public void setName(String name) {
		this.name = name;
	}

	public void throwException() {
		throw new RuntimeException("Exception occured");
	}

}

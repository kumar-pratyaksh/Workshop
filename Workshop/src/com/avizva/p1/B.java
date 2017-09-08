package com.avizva.p1;

public class B extends A {

	public void displayResult() {
		System.out.println("In sub class");
		// a.displayDefault();
		// a.displayProtected();
		// a.displayPublic();
		System.out.println("A's a not accesible");
		System.out.println("A's b " + b);
		System.out.println("A's c " + c);
		System.out.println("A's d " + d);
	}

}

package com.avizva.p2;

import com.avizva.p1.A;

public class X extends A {
	public void displayResult() {
		System.out.println("In subclass different package");
		// a.displayDefault();
		// a.displayProtected();
		// a.displayPublic();
		System.out.println("A's a not accesible");
		System.out.println("A's b " + b);
		System.out.println("A's c " + c);
		System.out.println("A's d not accesible");
	}
}

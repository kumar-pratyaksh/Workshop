package com.avizva.p1;

public class C {
	public void displayResult() {
		A a = new A();
		System.out.println("In same package");
		// a.displayDefault();
		// a.displayProtected();
		// a.displayPublic();
		System.out.println("A's a not accesible");
		System.out.println("A's b " + a.b);
		System.out.println("A's c " + a.c);
		System.out.println("A's d " + a.d);
	}
}

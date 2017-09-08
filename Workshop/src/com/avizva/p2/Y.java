package com.avizva.p2;

import com.avizva.p1.A;

public class Y {
	public void displayResult() {
		A a = new A();
		System.out.println("In different package");
		// a.displayDefault();
		// a.displayProtected();
		// a.displayPublic();
		System.out.println("A's a not accesible");
		System.out.println("A's b not accesible");
		System.out.println("A's c " + a.c);
		System.out.println("A's d not accesible");
	}
}

package com.avizva.p1;

public class A {

	private int a = 20;
	protected int b = 30;
	public int c = 40;
	int d = 50;

	public void displayResult() {
		System.out.println("In same class");
		// a.displayDefault();
		// a.displayProtected();
		// a.displayPublic();
		System.out.println("A's a " + a);
		System.out.println("A's b " + b);
		System.out.println("A's c " + c);
		System.out.println("A's d " + d);
	}

}

package com.avizva;

import com.avizva.p1.A;
import com.avizva.p1.B;
import com.avizva.p1.C;
import com.avizva.p2.X;
import com.avizva.p2.Y;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("a - private");
		System.out.println("b - protected");
		System.out.println("c - public");
		System.out.println("d - default");
		System.out.println();
		A a = new A();
		B b = new B();
		C c = new C();
		X x = new X();
		Y y = new Y();
		a.displayResult();
		System.out.println();
		b.displayResult();
		System.out.println();
		c.displayResult();
		System.out.println();
		x.displayResult();
		System.out.println();
		y.displayResult();
	}
}

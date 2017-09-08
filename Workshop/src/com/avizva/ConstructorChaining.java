package com.avizva;

class A {
	public A() {
		System.out.println("A's COnstructor");
	}
}

class B extends A {
	public B() {
		System.out.println("B's constructor");
	}
}

class C extends B {
	public C() {
		System.out.println("C's consturctor");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("In finalize c");
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		C c = new C();
		System.gc();
		c = null;
		for (int i = 0; i < 100000; i++) {

			c = new C();
		}
		for (int i = 0; i < 100000; i++)
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("IN finalize");
	}

}

package com.avizva;

class Functions {
	public void h() {
		System.out.println("Function h");
		for (int i = 1; i < 100; i++) {
			System.out.println("Thread:" + Thread.currentThread().getName() + " h:" + i);
		}
	}

	synchronized void f() {
		System.out.println("Function f");
		for (int i = 1; i < 100; i++) {
			System.out.println("Thread:" + Thread.currentThread().getName() + " f:" + i);
		}
	}

	synchronized void g() {
		System.out.println("Function g");
		for (int i = 1; i < 100; i++) {
			System.out.println("Thread:" + Thread.currentThread().getName() + " g:" + i);
		}
	}
}

public class Question1 {
	public static void main(String[] args) throws InterruptedException {
		Functions obj1 = new Functions();
		Functions obj2 = new Functions();

		// Case 1
		// In this case both threads will do their work without blocking each
		// other. This is so because both threads call different functions of
		// same object one of them synchronised and the other being not
		System.out.println("\n\n----------Case 1------------\n\n");
		Thread t1 = new Thread(() -> obj1.f(), "Thread 1");
		Thread t2 = new Thread(() -> obj1.h(), "Thread 2");
		t1.start();
		t2.start();
		t1.join(1000);
		t2.join(1000);

		// Case 2
		// This is a blocking call as function f is synchronised and same object
		// is used to access the function. Thread 4 will be blocked until thread
		// 3 finishes execution.
		System.out.println("\n\n----------Case 2------------\n\n");
		t1 = new Thread(() -> obj1.f(), "Thread 3");
		t2 = new Thread(() -> obj1.f(), "Thread 4");
		t1.start();
		t2.start();
		t1.join(1000);
		t2.join(1000);

		// Case 3
		// Syncronised keyword is applied on the object level. When we call
		// function f with obj1, it is locked until released. All calls we make
		// with the locked object are blocked.
		System.out.println("\n\n----------Case 3------------\n\n");
		t1 = new Thread(() -> obj1.f(), "Thread 5");
		t2 = new Thread(() -> obj1.g(), "Thread 6");
		t1.start();
		t2.start();
		t1.join(1000);
		t2.join(1000);

		// Case 4
		// In this case both threads will work concurrently as both threads use
		// different object.
		System.out.println("\n\n----------Case 4------------\n\n");
		t1 = new Thread(() -> obj1.f(), "Thread 7");
		t2 = new Thread(() -> obj2.h(), "Thread 8");
		t1.start();
		t2.start();
		t1.join(1000);
		t2.join(1000);

	}
}

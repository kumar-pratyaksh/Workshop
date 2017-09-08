package com.avizva.threads;

class Factorial {
	int res = 1;

	synchronized void fact(int n) {
		for (int i = 2; i <= n; i++) {
			res = res * i;
			try {
				Thread.sleep(1000);
				System.out.println(res);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

class Thread1 extends Thread {
	Factorial f;

	public Thread1() {
		super();
	}

	public Thread1(Factorial f) {
		super();
		this.f = f;
	}

	@Override
	public void run() {
		f.fact(5);
	}
}

class Thread2 extends Thread {
	Factorial f;

	public Thread2() {
		super();
	}

	public Thread2(Factorial f) {
		super();
		this.f = f;
	}

	@Override
	public void run() {
		f.fact(6);
	}
}

public class ThreadDemo3 {
	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		Thread1 thread1 = new Thread1(factorial);
		thread1.start();
		Thread2 thread2 = new Thread2(factorial);
		thread2.start();
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("In finalize");
	}
}

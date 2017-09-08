package com.avizva.threads;

class X {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		if (this.amount < amount) {
			System.out.println("Balance low waiting");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.amount -= amount;
		System.out.println("Successfully withdraw " + amount);
	}

	synchronized void deposit(int amount) {
		this.amount += amount;
		System.out.println("Deposited " + amount);
		notify();
	}
}

class BankerThread1 extends Thread {

	X ob;

	public BankerThread1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankerThread1(X ob) {
		super();
		this.ob = ob;
	}

	@Override
	public void run() {
		ob.withdraw(100000);
	}

}

class BankerThread2 extends Thread {

	X ob;

	public BankerThread2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankerThread2(X ob) {
		super();
		this.ob = ob;
	}

	@Override
	public void run() {
		ob.deposit(1000000);
	}

}

public class IPC {
	public static void main(String[] args) {

		X ob = new X();
		BankerThread1 bankerThread1 = new BankerThread1(ob);
		bankerThread1.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BankerThread2 bankerThread2 = new BankerThread2(ob);
		bankerThread2.start();
	}
}

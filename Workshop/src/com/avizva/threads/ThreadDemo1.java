package com.avizva.threads;

class MyThread extends Thread {

	private int sleepTime;

	public MyThread() {
		super();
		sleepTime = 1000;
	}

	public MyThread(String name) {
		super(name);
		sleepTime = 1000;
	}

	public MyThread(String name, int sleepTime) {
		super(name);
		this.sleepTime = sleepTime;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				System.out.println(i + " Hello world " + Thread.currentThread().getName());
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemo1 {

	public static void main(String[] args) {
		MyThread thread = new MyThread("Thread 1");
		MyThread thread2 = new MyThread("Thread 2");
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread.start();
		thread2.start();
		MyThread thread3 = new MyThread("Thread 3", 500);
		thread3.start();
	}

}

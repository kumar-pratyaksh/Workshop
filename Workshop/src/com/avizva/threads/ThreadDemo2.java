package com.avizva.threads;

class MyThread1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				System.out.println(i + " Hello world " + Thread.currentThread().getName());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class ThreadDemo2 {

	public static void main(String[] args) {
		MyThread1 myThread = new MyThread1();
		MyThread1 myThread1 = new MyThread1();
		MyThread1 myThread12 = new MyThread1();
		Thread thread = new Thread(myThread, "Mythread");
		Thread thread2 = new Thread(myThread1);
		Thread thread3 = new Thread(myThread12);
		ThreadGroup threadGroup = new ThreadGroup("Main thread group");
		thread.start();
		thread2.start();
		thread3.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

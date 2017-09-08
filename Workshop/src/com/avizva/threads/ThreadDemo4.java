package com.avizva.threads;

public class ThreadDemo4 {

	public static void main(String[] args) {

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Implemented thread");
			}
		};

		Thread thread3 = new Thread(runnable);

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println(i + " " + Thread.currentThread().getName());
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}, "thread1");
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 5; i > 0; i--) {
					System.out.println(i + " " + Thread.currentThread().getName());
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}, "thread2");
		thread.start();
		thread1.start();
	}

	public void finalize() {
		System.out.println("IN finalize");
	}

}

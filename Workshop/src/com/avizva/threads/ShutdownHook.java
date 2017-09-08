package com.avizva.threads;

class ShutdownHookThread extends Thread {
	@Override
	public void run() {
		System.out.println("Shutdown hook " + Thread.currentThread().getName());
	}
}

public class ShutdownHook {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		runtime.addShutdownHook(new Thread() {

			@Override
			public void run() {
				System.out.println("Anonymous shutdown hook " + Thread.currentThread().getName());
			}

		});
		System.out.println("Exiting main");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ThreadGroup group = new ThreadGroup("My Thread Group");
		Thread thread = new Thread(group, new ShutdownHookThread());
		Thread thread1 = new Thread(group, new ShutdownHookThread());
		Thread thread2 = new Thread(group, new ShutdownHookThread());
		Thread thread3 = new Thread(group, new ShutdownHookThread());
		System.out.println(thread);
		System.out.println(thread1);
		System.out.println(thread2);
		System.out.println(thread3);
		group.list();
	}
}

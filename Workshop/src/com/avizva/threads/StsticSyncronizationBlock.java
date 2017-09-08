package com.avizva.threads;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Table {
	static File file = new File("table.txt");

	synchronized static void printTable(int n) {
		try {
			FileWriter writer = new FileWriter(file, true);
			writer.write("");
			for (int i = 1; i <= 10; i++) {
				writer.append(n * i + "\n");
				System.out.println(n * i);
				try {
					Thread.sleep(400);
				} catch (Exception e) {
				}
			}
			writer.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}

class MyThread11 extends Thread {
	public void run() {
		Table.printTable(1);
	}
}

class MyThread2 extends Thread {
	public void run() {
		Table.printTable(10);
	}
}

class MyThread3 extends Thread {
	public void run() {
		Table.printTable(100);
	}
}

class MyThread4 extends Thread {
	public void run() {
		Table.printTable(1000);
	}
}

public class StsticSyncronizationBlock {
	public static void main(String t[]) {
		MyThread11 t1 = new MyThread11();
		MyThread2 t2 = new MyThread2();
		MyThread3 t3 = new MyThread3();
		MyThread4 t4 = new MyThread4();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

package com.avizva;

import java.util.Scanner;

public class Question10 extends Thread {
	private int x;
	public int answer;

	public Question10(int x) {
		this.x = x;
	}

	public void run() {
		if (x <= 2) {
			answer = 1;
		} else {
			try {
				Question10 f1 = new Question10(x - 1);
				Question10 f2 = new Question10(x - 2);
				f1.start();
				f2.start();
				f1.join();
				f2.join();
				answer = f1.answer + f2.answer;
			} catch (InterruptedException ex) {
			}
		}
	}

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		try {
			for (int i = 1; i <= n; i++) {
				Question10 f = new Question10(i);
				f.start();
				f.join();
				System.out.println(f.answer);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		scanner.close();
	}
}
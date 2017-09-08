package com.avizva;

import java.util.Scanner;

public class HelloWorld {

	int x = 8, y = 9;

	public static void main(String[] args) {
		System.out.println("Hello World!!!!!");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer:");
		Integer n = scan.nextInt();
		System.out.println("You entered:" + n);
		scan.close();
		System.out.println(n++);
		HelloWorld obj = new HelloWorld();
		System.out.println(obj.x + obj.y);
	}

}

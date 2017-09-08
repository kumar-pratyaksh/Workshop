package com.avizva.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class CharFinder {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream("xyz.txt");

		Scanner scanner = new Scanner(System.in);
		System.out.println("ENter the character you want to find:");
		char ch = scanner.next().charAt(0);
		int i;
		boolean flag = false;
		while ((i = fileInputStream.read()) != -1) {
			if ((char) i == ch) {
				flag = true;
				break;
			}
		}
		if (flag)
			System.out.println("Character exists in file");
		else {
			System.out.println("Character does not exists");
		}

		fileInputStream.close();
		scanner.close();
	}

}

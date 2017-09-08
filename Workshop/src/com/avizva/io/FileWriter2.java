package com.avizva.io;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriter2 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fStream = new FileOutputStream("s1.txt");
		DataOutputStream dStream = new DataOutputStream(fStream);
		String string;

		System.out.println("Enter data :");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		string = reader.readLine();
		byte[] arr = string.getBytes();

		dStream.write(arr);

		reader.close();
		dStream.close();
		fStream.close();

	}
}

package com.avizva.io;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReader2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream("s1.txt");
		DataInputStream dataInputStream = new DataInputStream(fileInputStream);

		int i;
		byte[] arr = new byte[5];
		dataInputStream.readFully(arr);
		System.out.println(new String(arr));
		while ((i = dataInputStream.read()) != -1) {
			System.out.println((char) i);
		}
		dataInputStream.close();
		fileInputStream.close();
		FileOutputStream fileOutputStream = new FileOutputStream("s1.txt", true);
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		String string = "This is it";
		for (byte b : string.getBytes()) {
			System.out.println(b);
		}
		stream.write(string.getBytes());
		stream.writeTo(fileOutputStream);
		stream.close();
		fileOutputStream.close();
		dataInputStream.close();
		fileInputStream.close();

	}

}

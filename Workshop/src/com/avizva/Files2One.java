package com.avizva;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Files2One {

	public static void main(String[] args) throws IOException {
		RandomAccessFile randomAccessFile = new RandomAccessFile("xyz.txt", "r");
		RandomAccessFile randomAccessFile2 = new RandomAccessFile("xyz.txt", "r");

		FileOutputStream fileOutputStream = new FileOutputStream("xyz2.txt", true);
		randomAccessFile.seek(10);
		byte[] arr = new byte[20];
		randomAccessFile.read(arr);
		fileOutputStream.write(arr, 0, 20);
		randomAccessFile2.seek(15);
		randomAccessFile2.read(arr);
		fileOutputStream.write(arr, 0, 20);

		randomAccessFile.close();
		randomAccessFile2.close();
		fileOutputStream.close();

	}

}

package com.avizva;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo {

	public static void writeCharsToFile(String fileName, int seek, String data) throws IOException {
		RandomAccessFile file = new RandomAccessFile(fileName, "w");
		file.seek(seek);
		file.write(data.getBytes());
		file.close();
	}

	public static byte[] readCharsFromFile(String fileName, int seek, int chars) throws IOException {
		RandomAccessFile file = new RandomAccessFile(fileName, "r");
		file.seek(seek);
		byte[] bytes = new byte[chars];
		file.read(bytes);
		file.close();
		return bytes;
	}

	public static void main(String[] args) {
		String fileName = "xyz.txt";
		try {
			System.out.println(new String(readCharsFromFile(fileName, 0, 10)));
			writeCharsToFile(fileName, 0, "This is what i write using seek");
			System.out.println(new String(readCharsFromFile(fileName, 0, 25)));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

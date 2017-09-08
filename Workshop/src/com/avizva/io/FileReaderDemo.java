package com.avizva.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		try (FileReader fReader = new FileReader("xyz.txt")) {
			int z;
			while ((z = fReader.read()) != -1) {
				System.out.println(z + " " + (char) z);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

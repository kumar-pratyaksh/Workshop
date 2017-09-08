package com.avizva.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritterDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("xyz.txt");
		FileWriter fileWriter = new FileWriter(file, true);
		String string = "Test string aaaaaaaajjbkjckjnckjnksjnckjfdncrnkjnckjrncskurnkwurncksjnks rchsr ihfsfkjsdkjs";
		fileWriter.append(string);
		fileWriter.close();
	}

}

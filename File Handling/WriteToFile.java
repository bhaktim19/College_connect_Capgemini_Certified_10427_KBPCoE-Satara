package com.edu;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		
		try {
			FileWriter fwrite = new FileWriter("C:DemoFile");
			//writing content to a file
			fwrite.write("Welcome to File Handling in Java...");
			//close the stream
			fwrite.close();
			System.out.println("Content has successfully wrote to the file..");
		} catch (IOException e) {
			System.out.println("Unexpected error has occured...");
			e.printStackTrace();
		}
		

	}

}

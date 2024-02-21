package com.edu;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppendFile {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fo = new FileOutputStream("C:DemoFile");
			String str = "Text to be appended.";
			fo.write(str.getBytes());
			fo.close();
			System.out.println("Content appended successfully...");
		} catch (FileNotFoundException e) {
			System.out.println("Unexpected error...");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Unexpected error...");
			e.printStackTrace();
		}
		

	}

}

package com.edu;

import java.io.File;
import java.io.FileInputStream;

public class ReadFromFile1 {

	public static void main(String[] args) {
		
		File fo = new File("C:DemoFile");
		
		int val;
		try {
			FileInputStream fin = new FileInputStream(fo);
			System.out.println("Content of the file is: ");
			while((val = fin.read())!= -1) {
				System.out.print((char)val);
			}
			System.out.println();
			fin.close();
		} catch (Exception e) {
			System.out.println("Unexpected error...");
			e.printStackTrace();
		}
		

	}

}

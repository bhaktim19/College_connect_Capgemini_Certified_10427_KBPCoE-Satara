package com.edu;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class CopyFile {

	public static void main(String[] args) {
		
		try {
			FileInputStream source = new FileInputStream("C:Demo");
			FileOutputStream target = new FileOutputStream("C:DemoFile");
			int val;
			while((val = source.read()) != -1) {
				target.write(val);
			}
			source.close();
			target.close();
			System.out.println("File copied successfully...");
		} catch (Exception e) {
			System.out.println("Unexpected error...");
			e.printStackTrace();
		}
		
		

	}

}

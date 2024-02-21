package com.edu;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class WriteToFile1 {

	public static void main(String[] args) {
		
		File fo = new File("C:DemoFile");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		try {
			FileOutputStream fout = new FileOutputStream(fo);
			fout.write(text.getBytes());
			fout.flush();
			fout.close();
			System.out.println("File Saved...");
		} catch (Exception e) {
			System.out.println("Unexpected error...");
			e.printStackTrace();
		}
		
		

	}

}

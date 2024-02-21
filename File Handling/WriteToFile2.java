package com.edu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile2 {

	public static void main(String[] args) {
		
		File fobj = new File("C:Demo");
		if(fobj.exists()==false) {
			try {
				if(fobj.createNewFile()) {
					System.out.println("File created successfully...");
				}
			
			} catch (IOException e) {
				System.out.println("File creation failed...");
				e.printStackTrace();
			}
		}
		
		String text;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text to write in file: ");
		text = sc.nextLine();
		try {
			FileWriter fwrite = new FileWriter(fobj.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fwrite);
			bw.write(text);
			bw.close();
			System.out.println("File saved...");
			
		} catch (Exception e) {
			System.out.println("Unexpected error...");
			e.printStackTrace();
		}
		

		

	}

}

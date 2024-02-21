package com.edu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFromFile2 {

	public static void main(String[] args) {
		
		File ob = new File("C:Demo");
		
		String text;
		
		try {
			FileReader fr = new FileReader(ob.getAbsoluteFile());
			BufferedReader br = new BufferedReader(fr);
			System.out.println("Content of the file is :");
			while ((text=br.readLine())!= null) {
				System.out.println(text);
			}
			br.close();
		} catch (Exception e) {
			System.out.println("Unexpeted error...");
			e.printStackTrace();
		}
		

	}

}

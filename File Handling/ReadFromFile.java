package com.edu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {
		try {
		File obj = new File("C:DemoFile");
		Scanner sc = new Scanner(obj) ;
		
		while (sc.hasNextLine()) {
			String data = sc.nextLine();
			System.out.println(data);
		}
		sc.close();
		
		} catch (FileNotFoundException e) {
			System.out.println("Unexpected error has occured...");
			e.printStackTrace();
		}


	}

}

package com.edu;

import java.io.File;
import java.io.IOException;

public class FileHandlingDemo {

	public static void main(String[] args) {
		
		// creating file object
		File fobj = new File("C:DemoFile"); 
		
		try {
			if (fobj.createNewFile()) {
				
				System.out.println(fobj.getName()+" is successfully created...");
								
			}
			else {
				
				System.out.println("File already exist in directory");
				
			}
		} catch (IOException e) {
			System.out.println("An unexpected error has occured");
			e.printStackTrace();
		}
		

	}

}

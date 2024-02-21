package com.edu;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		
		File fobj = new File("C:DemoFile");
		
		if (fobj.exists()) {
			
			System.out.println("The name of file is: "+fobj.getName());
			
			System.out.println("The absolute path of file is: "+fobj.getAbsolutePath());
			
			System.out.println("Is file writable?: "+fobj.canWrite());
			
			System.out.println("Is file readable? : "+fobj.canRead());
			
			System.out.println("The size of file in bytes : "+fobj.length());
		}
		else {
			
			System.out.println("File does not exists...");
		}
		

	}

}

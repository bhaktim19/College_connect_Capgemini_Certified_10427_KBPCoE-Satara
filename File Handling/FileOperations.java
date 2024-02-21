package com.edu;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributeView;

public class FileOperations {

	public static void main(String[] args) {
		 
		File fo = new File("C:DemoFile");
		
		File f = new File("C:Demo1");
		
		System.out.println("Is this file hidden? :"+fo.isHidden());
		
		long fileSize = fo.length();
		System.out.println("File size in bytes is : " + fileSize);
		System.out.println("File size in KB is : " + (double)fileSize/1024);
		System.out.println("File size in MB is : " + (double)fileSize/(1024*1024));
		
		System.out.println("Can read? : "+fo.canRead());
		
		fo.renameTo(f);
		
		System.out.println("Renamed file: "+f.getName());
		
		
	}

}

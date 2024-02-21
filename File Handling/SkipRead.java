package com.edu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SkipRead {

	public static void main(String[] args) {
		File fo = new File("C:DemoFile");
		try {
			FileInputStream fi = new FileInputStream(fo);
			int ch;
			System.out.println("File content after 5 bytes is:");
			fi.skip(5);
			while((ch = fi.read())!= -1) {
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

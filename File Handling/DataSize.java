package com.edu;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataSize {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fo = new FileOutputStream("C:DemoFile");
			DataOutputStream dos = new DataOutputStream(fo);
			dos.writeBytes("Java is a platform independent language.");
			int bytes = dos.size();
			System.out.println("Bytes in the file :"+bytes);
			dos.close();
		} catch (FileNotFoundException e) {
			System.out.println("Unexpected error...");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

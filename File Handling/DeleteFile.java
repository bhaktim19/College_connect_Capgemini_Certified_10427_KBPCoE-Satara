package com.edu;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fobj = new File("C:DemoFile");
		if (fobj.delete()) {
			System.out.println(fobj.getName()+" has deleted successfully...");
		}
		else {
			System.out.println("Unexpected error has occured...");
		}
	}

}

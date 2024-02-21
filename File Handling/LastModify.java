package com.edu;

import java.io.File;
import java.util.Date;

public class LastModify {

	public static void main(String[] args) {
		
		File f = new File("C:DemoFile");
		 long lm = f.lastModified();
		 System.out.println("File was last modified at : "+ new Date(lm));

	}

}

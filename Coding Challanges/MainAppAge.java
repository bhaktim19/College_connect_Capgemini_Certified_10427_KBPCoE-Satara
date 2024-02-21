package com.edu;

import java.util.Scanner;

class MyException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException(String message) {
        super(message);
    }
}

class SourceSpecified {
    public String checkAge(int age) throws MyException {
        if (age < 15) {
            throw new MyException("Age should be greater than or equal to 15");
        }
        return "valid";
    }
}

public class MainAppAge {

	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
       // System.out.print("Enter age: ");
        int age = scanner.nextInt();

        SourceSpecified ob = new SourceSpecified();
        try {
            String result = ob.checkAge(age);
            System.out.println(result);
        } catch (MyException e) {
            //System.out.println(e.getMessage());
        	e.printStackTrace();
        }

	}

}

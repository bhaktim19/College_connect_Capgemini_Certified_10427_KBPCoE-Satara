package com.edu.strings;

import java.util.Scanner;

public class StringsSwitch {

	public static void main(String[] args) {
		
        String week;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter choice:");
        week = s.nextLine();
        switch (week) 
        {
            case "Monday":
            System.out.print("Day: Monday");
            break;    
 
            case "Tuesday":
            System.out.print("Day: Tuesday");
            break;
 
            case "Wednesday":
            System.out.print("Day: Wednesday");
            break;
 
            case "Thursday":
            System.out.print("Day: Thursday");
            break;
 
            case "Friday":
            System.out.print("Day: Friday");
            break;
 
            case "Saturday":
            System.out.print("Day: Saturday");    
            break;
 
            case "Sunday":
            System.out.print("Day: Sunday");   
            break;    
        }

	}

}

package com.edu.lambda;

@FunctionalInterface
interface Addable{  
    int add(int a,int b);  
} 

public class MulArg {

	public static void main(String[] args) {
		
        // Multiple parameters in lambda expression  
        Addable ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(10,20));  
          
        // Multiple parameters with data type in lambda expression  
        Addable ad2=(int a,int b)->(a+b);  
        System.out.println(ad2.add(100,200));  
        
        Addable ad3=(int a,int b)->{  
            return (a+b);   
            };  
        System.out.println(ad3.add(400,200)); 

	}

}

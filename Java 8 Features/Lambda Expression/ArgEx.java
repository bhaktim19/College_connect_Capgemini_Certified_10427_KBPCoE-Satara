package com.edu.lambda;

@FunctionalInterface
interface Call{
	public String call(String name);
}

public class ArgEx {

	public static void main(String[] args) {
        // Lambda expression with single parameter.  
        Call c1=(name)->{  
            return "Hello, "+name;  
        };  
        System.out.println(c1.call("Bhakti"));  
          
        // You can omit function parentheses    
        Call c2= name ->{  
            return "Hello, "+name;  
        };  
        System.out.println(c2.call("Anurag"));  

	}

}

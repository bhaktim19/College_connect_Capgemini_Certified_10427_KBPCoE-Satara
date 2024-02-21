package com.edu.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Product{
    private int productId;
    private String productName;
    private double price;
    
    public Product() {
    	super();
    }

    // Constructor to initialize product details
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Getter methods for product attributes
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    // Setter methods for product attributes
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Override toString() method to provide a meaningful string representation
    @Override
    public String toString() {
        return "Product ID: " + productId + ", Name: " + productName + ", Price: " + price;
    }
} 

class SortProductId implements Comparator<Product>{

	@Override
	public int compare(Product product1, Product product2) {
		
		if(product1.getProductId()>product2.getProductId())
			return 1;
		else if(product1.getProductId()<product2.getProductId())
			return -1;
		else
			return 0;
	}
}

class SortProductPrice implements Comparator<Product>{

	@Override
	public int compare(Product product1, Product product2) {
		
		if(product1.getPrice()>product2.getPrice())
			return 1;
		else if(product1.getPrice()<product2.getPrice())
			return -1;
		else
			return 0;
	}
}

class SortProductName implements Comparator<Product>{

	@Override
	public int compare(Product product1, Product product2) {
		return product1.getProductName().compareTo(product2.getProductName());
	}
	
}
    

    public class MainAppProduct {

	public static void main(String[] args) {
		
		 TreeSet<Product> products = new TreeSet<>(new SortProductId());

	        // Create three product objects with sample data
	        Product product1 = new Product(101, "Laptop", 750.00);
	        Product product2 = new Product(103, "Mouse", 25.00);
	        Product product3 = new Product(102, "Keyboard", 50.00);

	        // Add product objects to the TreeSet
	        products.add(product1);
	        products.add(product2);
	        products.add(product3);
	        
	        Iterator<Product> pit = products.iterator();
	        System.out.println("Sort by Product ID");
	        System.out.println("PID\tPNAME\tPRICE");
			System.out.println("----------------------------------");
			while(pit.hasNext()) {
				Product pob = pit.next();
				System.out.println(pob.getProductId()+"\t"+pob.getProductName()+"\t"+pob.getPrice());
						
			}
			
			TreeSet<Product> products1 = new TreeSet<>(new SortProductPrice());
			products1.add(product1);
	        products1.add(product2);
	        products1.add(product3);
	        
	        Iterator<Product> pit1 = products1.iterator();
	        System.out.println();
	        System.out.println("Sort by Product Price");
	        System.out.println("PID\tPNAME\t\tPRICE");
			System.out.println("----------------------------------");
			while(pit1.hasNext()) {
				Product pob = pit1.next();
				System.out.println(pob.getProductId()+"\t"+pob.getProductName()+"\t\t"+pob.getPrice());
						
			}
			
			TreeSet<Product> products2 = new TreeSet<>(new SortProductName());
			products2.add(product1);
	        products2.add(product2);
	        products2.add(product3);
	        
	        Iterator<Product> pit2 = products2.iterator();
	        System.out.println();
	        System.out.println("Sort by Product Name");
	        System.out.println("PID\tPNAME\t\tPRICE");
			System.out.println("----------------------------------");
			while(pit2.hasNext()) {
				Product pob = pit2.next();
				System.out.println(pob.getProductId()+"\t"+pob.getProductName()+"\t\t"+pob.getPrice());
						
			}
	        

	}

}




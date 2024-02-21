package com.edu.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{
	private int pid;
	private String pname;
	private float price;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int pid, String pname, float price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
	
}

public class ProductFilter {

	public static void main(String[] args) {
		List<Product> plist = new ArrayList<Product>();
		
		//filter product greater than 20000
		System.out.println("Using traditional method:");
		System.out.println("List of products with price greater than 20,000:");

		for(Product p:getProducts()) {
			if(p.getPrice()>20000) {
				plist.add(p);
			}
		}
		
		System.out.println(plist);
		
		//Use Stream API
		
		Stream<Product> psm=getProducts().stream();
		
		List<Product> fillist=psm.filter(p->p.getPrice()>20000).collect(Collectors.toList());
		
		System.out.println("Using Stream API:");
		System.out.println("List of products with price greater than 20,000:");
		System.out.println(fillist);

	}
	
	public static List<Product> getProducts(){
		
		List<Product> plist1=new ArrayList<Product>();
		plist1.add(new Product(1,"TV",45600));
		Product p1=new Product(2,"mobile",30000);
		plist1.add(p1);
		plist1.add(new Product(3,"Laptop",16000));
		
		return plist1;
		
	}

}

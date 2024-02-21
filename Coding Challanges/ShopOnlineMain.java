package com.edu;

class Customer{
	int id;
	String name;
	double walletBalance;
	String address;
	public Customer(int id, String name, double walletBalance, String address) {
		super();
		this.id = id;
		this.name = name;
		this.walletBalance = walletBalance;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWalletBalance() {
		return walletBalance;
	}
	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}

class Item{
	int id;
	String name;
	String companyName;
	double price;
	boolean inStock;
	public Item(int id, String name, String companyName, double price, boolean inStock) {
		super();
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.price = price;
		this.inStock = inStock;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isInStock() {
		return inStock;
	}
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
}
class ShoppingWebsite{
	
	public String purchaseItem(Item i, Customer c) throws ItemOutOfStockException,InsufficientBalanceException {
		
	    if (!i.isInStock()) {
	        throw new ItemOutOfStockException("Item is out of stock: " + i.getName());
	    }
	    if(c.getWalletBalance()<i.getPrice()) {
	    	throw new InsufficientBalanceException("Insufficient balance in wallet: " + c.getWalletBalance());
	    }
	    c.setWalletBalance(c.getWalletBalance()-i.getPrice());
	    return "Order Successful";
	}
	
}

class InsufficientBalanceException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException(String message) {
		super (message);
	}
	
}

class ItemOutOfStockException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ItemOutOfStockException(String message) {
		super (message);
	}
	
}

public class ShopOnlineMain {

	public static void main(String[] args) throws ItemOutOfStockException, InsufficientBalanceException {
		
		Customer cusDet = new Customer(927392, "Steve", 5000.0, "USA");
		Item itemDet = new Item(27392, "T-shirt", "US Polo", 800, true);
		ShoppingWebsite obj = new ShoppingWebsite();
		String out = obj.purchaseItem(itemDet, cusDet);
		System.out.println(out);
		

	}

}

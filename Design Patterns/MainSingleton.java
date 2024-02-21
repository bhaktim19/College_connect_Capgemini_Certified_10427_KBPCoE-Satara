package com.edu.pattern;

class DbConnection{
	
	private static DbConnection dbobj;
	private DbConnection() {} //i dont want object to be created from main method
	
	public static DbConnection getDbConnectionObject() {
			if(dbobj==null)
			dbobj = new DbConnection();
		return dbobj;
	}
	
	void displayData() {
		System.out.println("User Records");
	}
     
}

public class MainSingleton {

	public static void main(String[] args) {
		//dont allow user to create multiple object
		//DI

		//DbConnection ob = new DbConnection();
		DbConnection ob = DbConnection.getDbConnectionObject();
		ob.displayData();

	}

}

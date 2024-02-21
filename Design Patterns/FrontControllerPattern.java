package com.edu.pattern;

class HomeView {
	public void show(){
	    System.out.println("Displaying Home Page");
	 }
}

class StudentView1 {
	public void show(){
	    System.out.println("Displaying Student Page");
	  }
}

class Dispatcher {
	   private StudentView1 studentView;
	   private HomeView homeView;
	   
	   public Dispatcher(){
	      studentView = new StudentView1();
	      homeView = new HomeView();
	   }

	   public void dispatch(String request){
	      if(request.equalsIgnoreCase("STUDENT")){
	         studentView.show();
	      }
	      else{
	         homeView.show();
	      }	
	 }
}


class FrontController {
	
	   private Dispatcher dispatcher;

	   public FrontController(){
	      dispatcher = new Dispatcher();
	   }

	   private boolean isAuthenticUser(){
	      System.out.println("User is authenticated successfully.");
	      return false;
	   }

	   private void trackRequest(String request){
	      System.out.println("Page requested: " + request);
	   }

	   public void dispatchRequest(String request){
	      //log each request
	      trackRequest(request);
	      
	      //authenticate the user
	      if(isAuthenticUser()){
	         dispatcher.dispatch(request);
	      }	
	 }
}

public class FrontControllerPattern {

	public static void main(String[] args) {
		FrontController frontController = new FrontController();
	    frontController.dispatchRequest("HOME");
	    frontController.dispatchRequest("STUDENT");
	    frontController.dispatchRequest("ADMIN");
	}

}

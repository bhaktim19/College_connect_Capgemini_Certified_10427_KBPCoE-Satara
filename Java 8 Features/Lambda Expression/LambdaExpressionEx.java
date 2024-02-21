package com.edu.lambda;

@FunctionalInterface
interface Hello{
	public void display(String s);
	
}




public class LambdaExpressionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hello hob=(str)->{
			System.out.println("Hello "+str);
		};
         hob.display("Bhakti");
         
         
         Runnable rob = ()->{
        	 for(int i=1;i<=5;i++) {
        		 System.out.println(i +" "+Thread.currentThread());
        	 }
         };
         
         Thread tob = new Thread(rob);
         tob.setName("first");
         tob.start();
         Thread tob1 = new Thread(rob);
         tob.setName("second");
         tob1.start();
         
         
	}

}

package com.home.practice;

public class ExceptionDemo extends Throwable {

	 public static void main(String args[]){ 
		 int a=100;
		 int b=2;
		   try{  
		      //code that may raise exception  
		      int data=a/b;  
		      System.out.println(data);
		   }catch(ArithmeticException ae){
			   System.out.println(ae);
		   }catch(ClassCastException e) {
			  System.out.println(e.toString());
		  }catch(Exception e) {
			  
		  }

}
}

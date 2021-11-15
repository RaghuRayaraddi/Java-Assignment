package com.technoelevate.java.exception;

public class ExcRetStatement {

	public static void main(String[] args) {
		System.out.println(returnStatement());
	}
	public static int returnStatement() {
		try {
			System.out.println("Inside try block");
			int res=10/0;
			System.out.println("result: "+res);
			return res;
			
		} catch (ArithmeticException e) {
			System.out.println("Inside catch block");
			return 10;						
		} finally {              //finally have higher precidency than return statement
			System.out.println("Inside finally block");
		//	return 9;
		}
	}
}

package com.technoelevate.java.exception;

public class ArithmeticExceptionClass {

	public static void main(String[] args) {
		int x=0;
		int y=10;
		System.out.println("Main method started");
		System.out.println(y/x);   //risky code
		System.out.println("Main method end");
	}

}

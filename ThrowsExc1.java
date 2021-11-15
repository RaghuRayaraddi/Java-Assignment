package com.technoelevate.java.exception;

import java.io.IOException;

public class ThrowsExc1 {

	public static void main(String[] args) {
		throwmethod1();
	}

	private static void throwmethod1() {
		System.out.println("first method");
		throwmethod2();
	}

	private static void throwmethod2() {
		System.out.println("second method");
		try {
			throwmethod3();
		} catch (IOException e) {
			System.out.println("Exception occured");
		}
	}

//	private static void throwmethod3() {
//		System.out.println("third method");
//		throw new ArithmeticException();  //unchecked exception has ability to propagate its caller implicitly
//	}
	private static void throwmethod3() throws IOException {
		System.out.println("third method");
		throw new IOException();  //checked exception dont have the ability to propagate its caller
	}

}

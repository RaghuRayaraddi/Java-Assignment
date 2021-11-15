package com.home.practice;
import java.lang.Exception;
public class ExceptionDemo1 {
	int a[]= {10,34,23};

	public static void main(String[] args) {
		ExceptionDemo1 demo1=new ExceptionDemo1();
	System.out.println("hi thi is my first line");
	System.out.println("this is second line");
	
	try {
		System.out.println(demo1.a[3]);
	}
	catch(ArithmeticException e) {
		System.out.println("try block is showing error");
	}
//	catch(Exception r) {
//		System.out.println("this is not ArithmeticException");
//	}
	finally {
		System.out.println("thank you");
	}
	

	}

}

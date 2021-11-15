package com.home.practice;

import java.util.Scanner;

public class ExceptionHandle {
	
	void division() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the value of x ");
			int x=sc.nextInt();
			System.out.println("enter the value of y ");
			int y=sc.nextInt();
			
			int z=x/y;
			System.out.println(z);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("dont pass zero");
		}
	}

	public static void main(String[] args) {
		ExceptionHandle exc = new ExceptionHandle();
		exc.division();
	}

}

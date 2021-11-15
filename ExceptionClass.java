package com.technoelevate.java.exception;

import java.sql.SQLException;
import java.util.Scanner;

public class ExceptionClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Enter two values:");
			int x=sc.nextInt();
			int y=sc.nextInt();
			System.out.println("Main method started");
			int res=y/x;
			System.out.println("Division of the number is:");
			System.out.println(res);
			System.out.println("Main method end");
		}  catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}  catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}  catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("finally block");
		}
		sc.close();
	}

}

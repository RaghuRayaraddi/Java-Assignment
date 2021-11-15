package com.home.practice;

import java.util.Scanner;

public class School {
	String name;
	int age;

	public School(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) throws AgeException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ip");
		String s = sc.nextLine();
		int n = sc.nextInt();
		
		School shc=new School(s, n);
		try {
			if(shc.age<6) {
				System.out.println("sorry your child is not elgible for study");
				throw new AgeException("sorry your child is not elgible for study");
			} 
			else
				System.out.println("your children is eligble for admission");
		}
		catch(AgeException m) {
			System.out.println("Exception is handled by customException");
			
		}
		System.out.println("thank you");

			
		
		
		
		
	}

}

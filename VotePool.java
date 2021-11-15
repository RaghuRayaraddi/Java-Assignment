package com.home.practice;

import java.util.Scanner;

public class VotePool {
	int age;
	String name;
	
	public VotePool(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public static void main(String[] args) throws AgeExc{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int x=sc.nextInt();
		System.out.println("Enter the name");
		String y=sc.next();
		VotePool votePool=new VotePool(x, y);
		try {
		if(x<18) {
			System.out.println("Not eligible");
		throw new AgeExc("Wait for some more years");
		}
		else
			System.out.println("Eligible");
			
		} catch (java.lang.Exception e) {
			// TODO: handle exception
		}finally {
			System.out.println("\"Welcome\"\nThankyou for your concern");
		}
		
	}

}

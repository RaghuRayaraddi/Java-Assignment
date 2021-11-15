package com.technoelevate.java.mondayassignment;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FactoryClass factoryClass=new FactoryClass();
		System.out.println("Select the name from given option");
		System.out.println("1.Avinash\n2.Dhananjay\n3.Nitish\n4.Venkatesh");
		System.out.println("Enter your choice");
	
		int choice=sc.nextInt();
		switch (choice) {
		case 1:{
			factoryClass.getEmployee("Avinash").type();
			break;
		}
		case 2:{
			factoryClass.getEmployee("Dhananjay").type();
			break;
		}
		case 3:{
			factoryClass.getEmployee("Nitish").type();
			break;
		}
		case 4:{
			factoryClass.getEmployee("Venkatesh").type();
			break;
		}
		default: System.out.println("Invalid");
		}
		sc.close();
	}
	}



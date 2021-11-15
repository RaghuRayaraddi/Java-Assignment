package com.technoelevate.java.abstraction;

import java.util.Scanner;

public class MainMethod4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select the browser from given option");
		System.out.println("1.Chrome\n2.Mozilla\n3.Opera\n4.Safari");
		System.out.println("Enter your choice");
		FactoryClass factoryClass=new FactoryClass();
		int choice=sc.nextInt();
		switch (choice) {
		case 1:{
			factoryClass.getBrowser("Chrome").start();
			break;
		}
		case 2:{
			factoryClass.getBrowser("Mozilla").start();
			break;
		}
		case 3:{
			factoryClass.getBrowser("Opera").start();
			break;
		}
		case 4:{
			factoryClass.getBrowser("Safari").start();
			break;
		}
		default: System.out.println("Invalid");
		}
		sc.close();
	}

}

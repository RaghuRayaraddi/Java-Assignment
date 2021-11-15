package com.technoelevate.java.objectclass;

public class MainMethod5 {
	public static void main(String[] args) {
		Mobile mobile=new Mobile("Samsung", 68000.50, 12);
		Mobile mobile2=new Mobile("Apple",100000.50, 4);
		System.out.println(mobile);
		System.out.println(mobile2);
		System.out.println(mobile.hashCode());
		System.out.println(mobile2.hashCode());
		System.out.println(mobile.equals(mobile2));
	}
}

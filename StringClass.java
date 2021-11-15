package com.technoelevate.java.stringclass;

public class StringClass {

	public static void main(String[] args) {
		String str=new String("Techno Elevate");
		String str2=new String("Techno Elevate");
		String str3=new String("Test Yantra");
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str.equals(str2));
		System.out.println(str2.equals(str3));
	}

}

package com.technoelevate.java.sundayassignment;

public class ReverseAString {

	public static void main(String[] args) {
		String name="Raghu";
		int len=name.length();
		String rev=" ";
		
		for (int i = name.length()-1; i>=0;  i--) {
			rev +=name.charAt(i);
			
		}
		System.out.println(rev);
	}

}

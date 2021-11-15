package com.technoelevate.java.sundayassignment;

public class RASPalindrome {
	
	public static void main(String[] args) {
		String name="mom";
		int len=name.length();
		String rev="";
		
		for (int i = name.length()-1; i>=0;  i--) {
			rev +=name.charAt(i);
			
		}
		System.out.println(rev);
		if(rev.equals(name)) 
			System.out.println(name+" is Palindrome");
		else
			System.out.println(name+" is not Palindrome");
	}

}

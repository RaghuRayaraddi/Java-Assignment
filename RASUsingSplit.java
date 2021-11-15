package com.technoelevate.java.sundayassignment;

public class RASUsingSplit {

	public static void main(String[] args) {
		String string="Raghu Rayaraddi";
		String array[]=string.split(" ");
		for (int i =array.length-1; i>=0; i--) {
			System.out.print(array[i]+" ");
			
			
		}
	}

}

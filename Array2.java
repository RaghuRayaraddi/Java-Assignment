package com.technoelevate.java.arrays;

public class Array2 {

	public static void main(String[] args) {
		int[] arr= {12,23,34,45,56};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for (int a:arr){
			System.out.println(a);
		}
	}
}

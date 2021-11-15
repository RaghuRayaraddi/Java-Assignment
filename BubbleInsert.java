package com.technoelevate.java.arrays;

public class BubbleInsert {
public static void main(String[] args) {
		
		int ar[]= {1,2,3,4,5};
		ar=insert(ar,39,2);
		for(int i=0;i<=5;i++) {
			System.out.println(ar[i]+" ");
		}
	}

	 static int[] insert(int[] ar,int ele, int in) {
		if(in<0||in>=4) {
			System.out.println("Insertion not possible");
			return ar;
		}
		
		int y[]=new int[5+1];
		 y[in]=ele;
		for(int i=0;i<5;i++) {
			if(i<in) {
				y[i]=ar[i];
			}
			else
			{
				y[i+1]=ar[i];
			}
		}
		return y;
	}

}

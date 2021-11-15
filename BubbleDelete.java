package com.technoelevate.java.arrays;

public class BubbleDelete {

	public static void main(String[] args) {

		int ar[] = { 1, 2, 3, 4, 5 };
		ar = delete(ar, 2);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}

	static int[] delete(int[] ar, int in) {
		if (in <= 0 || in >= ar.length) {
			System.out.println("Deletion not possible");
			return ar;
		}

		int y[] = new int[ar.length - 1];
		for (int i = 0; i < ar.length - 1; i++) {
			if (i < in) {
				y[i] = ar[i];
			} else {
				y[i] = ar[i + 1];
			}
		}
		return y;
	}

}

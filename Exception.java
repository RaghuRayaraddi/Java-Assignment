package com.home.practice;

public class Exception {
int x;
int y;



	public Exception(int x, int y) {
	this.x = x;
	this.y = y;
}
	void div() {
		int z= x/y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		Exception exc = new Exception(2, );
		exc.div();
	}

}

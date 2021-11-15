package com.technoelevate.java.functionalinterface;

public class StaticMetRef {
	public static void name() {
		System.out.println("Static method in normal class");
		
	}
	public static void add() {
		System.out.println("Second static method");
	}
	
//	public static void main(String[] args) {
//		FunInterface funInterface=StaticMetRef::name;
//		funInterface.display();
//	}

	public static void main(String[] args) {
		FunInterface funInterface=StaticMetRef::add;
		funInterface.display();
	}
}

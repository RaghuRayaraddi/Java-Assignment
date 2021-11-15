package com.technoelevate.java.functionalinterface;

public class NonStaticMetRef {
	public static void main(String[] args) {
		FunInterface funInterface=NonStaticMetRef::add;
		funInterface.display();
		
		NonStaticMetRef metRef=new NonStaticMetRef();
		 funInterface=metRef::name;
			funInterface.display();
		}
	public void name() {
		System.out.println("Non Static method in normal class");
		
	}
	public static void add() {
		System.out.println("Static method in normal class");
		
	}
		
}


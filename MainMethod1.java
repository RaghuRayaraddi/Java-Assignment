package com.technoelevate.java.typecasting;

public class MainMethod1 {

	public static void main(String[] args) {
		Parent parent1=new Child();
		parent1.parentMethod();
		System.out.println(parent1.num);
	}

}

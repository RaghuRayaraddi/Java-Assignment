package com.technoelevate.java.functionalinterface;

public class ConstroctorRef {

	public ConstroctorRef(int i) {
		System.out.println("Constroctor ref from normal class");
		
	}
	
	public static void main(String[] args) {
		FunInterface funInterface=ConstroctorRef::new;
		funInterface.display(10);
	}
}

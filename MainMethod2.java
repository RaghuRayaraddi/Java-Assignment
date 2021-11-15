package com.technoelevate.java.coupling;

public class MainMethod2 {

	public static void main(String[] args) {
//		FirstEmployee firstEmployee=new FirstEmployee(); //Tight coupling
//		firstEmployee.position();
		
		Company company=new FirstEmployee();  //Loose coupling
		company.position();
		company =new SecondEmployee();
		company.position();
	}
	

}

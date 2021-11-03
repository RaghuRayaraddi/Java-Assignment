//Custom exception : If below 18 yrs, throw exception else eligible to vote
package com.technoelevate.java.tuesdayassignment;

public class Person {
	int age;

	public Person(int age) {
		super();
		this.age = age;
	}
	 public void eligible(int prage) throws notEligible {
		if(prage>=age) {
			System.out.println("Eligible to vote");
		}
		else {
			throw new notEligible("Not Eligible");
		}

	 }
}

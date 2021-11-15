//Custom exception for marriage example
package com.technoelevate.java.tuesdayassignment;

public class Marriage {
	int groomage;
	int brideage;
	public Marriage(int groomage, int brideage) {
		super();
		this.groomage = groomage;
		this.brideage = brideage;
	}
	public void eligible(int i, int j) throws belowage {
	if(i>=groomage && j>=brideage) {
		System.out.println("eligible ");
		
	}
	else
		throw new belowage(" age is not possible");
		
	}

}

package com.technoelevate.java.tuesdayassignment;

public class notEligible extends Exception {
	String msg;

	public notEligible(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}
}

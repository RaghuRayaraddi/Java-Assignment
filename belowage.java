package com.technoelevate.java.tuesdayassignment;

public class belowage extends Exception {

	String msg;

	public belowage(String msg) {
		super();
		this.msg = msg;
	}
	
	@Override
	public String getMessage() {
		return msg;
	}
	
	
}

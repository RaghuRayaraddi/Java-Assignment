package com.technoelevate.java.exception;

public class InsufficientBalance extends Exception {
	String msg;
	
	public  InsufficientBalance (String msg) {
		super ();
		this.msg=msg;
		
	}
	public String getMessage() {
		return msg;
	}
	
}

package com.home.practice;

public class StudentPercentageException extends RuntimeException{
	String msg;

	public StudentPercentageException(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String getMessage() {
		return msg;
	}
	

}

package com.technoelevate.java.hasarelationship;

public class Engine {
	String name;
	int engineNum;
	String type;
	public Engine(String name, int engineNum, String type) {
		super();
		this.name = name;
		this.engineNum = engineNum;
		this.type = type;
		System.out.println(this.name+" "+this.engineNum+" "+this.type);
	}
//	@Override
//	public String toString() {
//		return "Engine [name=" + name + ", engineNum=" + engineNum + ", type=" + type + "]";
//	}
}

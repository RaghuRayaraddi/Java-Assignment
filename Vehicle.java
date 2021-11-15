package com.technoelevate.java.hasarelationship;

public class Vehicle {
	String name;
	String colour;
	Engine engine;
	Tyre tyre;
	double price;
	public Vehicle(String name, String colour, Engine engine, Tyre tyre, double price) {
		super();
		this.name = name;
		this.colour = colour;
		this.engine = engine;
		this.tyre = tyre;
		this.price = price;
	}
	public void status() {
		System.out.println(this.name+" "+this.colour+" "+this.engine+" "+this.tyre+" "+this.price);
		System.out.println("Vehicle is ready to go on roads/ground");
	}
}

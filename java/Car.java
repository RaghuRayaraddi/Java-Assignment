package com.technoelevate.mock;

public class Car extends Vehicle{
	void start1() {
		System.out.println("start the car");
	}
	public static void main(String[] args) {
		Vehicle vehicle = new Car();//up-casting
		Car car = (Car)vehicle;
		
	}

}

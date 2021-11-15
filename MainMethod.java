package com.technoelevate.java.hasarelationship;

public class MainMethod {
	public static void main(String[] args) {
		Engine engine=new Engine("BS4", 1234, "petrol");
		Tyre tyre=new Tyre("MRF", "Tubeless", 15.6f, 4000);
		Vehicle vehicle=new Vehicle("Audi", "white", engine, tyre , 4000000);
		vehicle.status();
	}
}

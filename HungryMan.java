package com.technoelevate.java.synchronise.waitnotify;

public class HungryMan extends Thread {
	Hotel hotel;
	int noOfDosa;
	public HungryMan(Hotel hotel, int noOfDosa) {
		super();
		this.hotel = hotel;
		this.noOfDosa = noOfDosa;
	}
	
	public void run() {
		hotel.eat(noOfDosa);
	}
}

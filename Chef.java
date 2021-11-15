package com.technoelevate.java.synchronise.waitnotify;

public class Chef extends Thread{
	Hotel hotel;
	int noOfDosa;
	public Chef(Hotel hotel, int noOfDosa) {
		super();
		this.hotel = hotel;
		this.noOfDosa = noOfDosa;
	}
	
	public void run() {
		hotel.prepare(noOfDosa);
	}
}

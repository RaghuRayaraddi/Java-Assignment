package com.technoelevate.java.synchronise.waitnotify;

public class Hotel {
	int dosa;

	public Hotel(int dosa) {
		super();
		this.dosa = dosa;
	}
	
	public synchronized void prepare(int noOfDosa) {
		dosa+=noOfDosa;
		System.out.println("Prepared dosa successfully");
		System.out.println("Available dosa = "+dosa);
		this.notify();
	}
	
	public synchronized void eat(int noOfDosa) {
		while(noOfDosa>dosa) {
			System.out.println("Preparing please wait");
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
		System.out.println(dosa+" Hot dosa prepared ");
		dosa-=noOfDosa;
		
	}
}

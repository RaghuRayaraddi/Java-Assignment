package com.technoelevate.java.synchronise.waitnotify;

public class GoDown {
	int products;

	public GoDown(int products) {
		super();
		this.products = products;
	}
	
	public synchronized void store(int noOfItems) {
		products += noOfItems;
		System.out.println("Stored the items successfully");
		System.out.println("Available products ="+products);
		this.notify();
	}
	
	public synchronized void purchase(int noOfItems) {
		while(noOfItems>products) {
			System.out.println("Out of stock!!! Please wait for sometime");
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		products -= noOfItems;
		System.out.println("Purchase successful\nAvaliable products ="+products);
	}
}

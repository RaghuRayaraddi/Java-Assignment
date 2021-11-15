package com.technoelevate.java.synchronise.waitnotify;

public class Customer extends Thread{
	GoDown goDown;
	int noOfItems;
	public Customer(GoDown goDown, int noOfItems) {
		super();
		this.goDown = goDown;
		this.noOfItems = noOfItems;
	}
	
	public void run() {
		goDown.purchase(noOfItems);
	}
}

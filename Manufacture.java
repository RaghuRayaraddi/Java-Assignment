package com.technoelevate.java.synchronise.waitnotify;

public class Manufacture extends Thread{
	GoDown goDown;
	int noOfItems;
	public Manufacture(GoDown goDown, int noOfItems) {
		super();
		this.goDown = goDown;
		this.noOfItems = noOfItems;
	}
	
	public void run() {
		goDown.store(noOfItems);
	}

}

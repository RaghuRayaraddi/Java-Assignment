package com.technoelevate.java.synchronise.waitnotify;

public class GoDownManagement {
	public static void main(String[] args) {
		GoDown goDown=new GoDown(100);
		new Customer(goDown, 80).start();
		new Customer(goDown, 50).start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Manufacture(goDown, 50).start();
	}
}

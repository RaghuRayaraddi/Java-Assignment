package com.technoelevate.java.synchronise.waitnotify;

public class HotelMain {

	public static void main(String[] args) {
		Hotel hotel=new Hotel(20);
		System.out.println("Welcome to my Hotel");
		new HungryMan(hotel, 10).start();
		new HungryMan(hotel, 15).start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Chef(hotel, 10).start();
	}

}

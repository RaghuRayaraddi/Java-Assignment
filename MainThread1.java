package com.technoelevate.java.multithreading;

public class MainThread1 {

	public static void main(String[] args) {
		MyThread1 myThread1=new MyThread1();
		Thread thread=new Thread(myThread1);
		thread.start();
		System.out.println("Main Thread1 started");
	}

}

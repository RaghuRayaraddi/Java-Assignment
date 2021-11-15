package com.technoelevate.java.multithreading1;

public class Main1 {

	public static void main(String[] args) {
		MyThread1 myThread1=new MyThread1();
		Thread thread=new Thread(myThread1);
		for (int i = 0; i < 10; i++) {
		System.out.println("Main Thread");
		}
			myThread1.start();
			myThread1.yield();
			thread.start();
	}

	}


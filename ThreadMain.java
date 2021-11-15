package com.technoelevate.java.multithreading;

public class ThreadMain {

	public static void main(String[] args) {
//		System.out.println(Thread.currentThread().getPriority());
//		System.out.println(Thread.currentThread().getName());
		MyThread myThread=new MyThread();
		
		Thread thread=new Thread(myThread);
		thread.setPriority(9);
		System.out.println(thread.getPriority());
		thread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread ");
			
		} 
	}

}

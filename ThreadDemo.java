package com.technoelevate.java.multithreading;

public class ThreadDemo extends Thread {

	public static void main(String[] args) {
		ThreadDemo demo=new ThreadDemo();
		System.out.println(Thread.currentThread().getPriority());
		demo.setPriority(9);
		demo.start();
		System.out.println("Main Thread st-1");
		System.out.println("Main Thread st-2");
		System.out.println("Main Thread st-3");
		System.out.println("Main Thread st-4");
		ThreadDemo2 demo2=new ThreadDemo2();
		System.out.println(demo.getPriority());
		demo2.start();
	}
	
//	@Override
//	public void run() {
//		System.out.println("My Thread st-1");
//		System.out.println("My Thread st-2");
//		System.out.println("My Thread st-3");
//		System.out.println("My Thread st-4");
//	}

}

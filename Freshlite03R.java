package com.technoelevate.java.thuassignment;

public class Freshlite03R implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread.currentThread().setName("Freshlite03 React batch");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setPriority(2);
		System.out.println("freshlite 03 react batch priority = "+Thread.currentThread().getPriority());
		 System.out.println("Welcome to \"TestYantra\"");
	}

}

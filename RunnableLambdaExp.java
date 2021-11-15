package com.technoelevate.java.lambda;

public class RunnableLambdaExp {

	public static void main(String[] args) {
		Runnable runnable=()->{
			System.out.println("My Thread");
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("Run Method");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		runnable.run();
	
	}

}

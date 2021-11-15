package com.technoelevate.java.anonymousclass;

public class MainSinger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singer singer =new Singer() {
			
			@Override
			public void name() {
				// TODO Auto-generated method stub
				System.out.println("raghu");
			}
			
			@Override
			public long contact() {
				// TODO Auto-generated method stub
				System.out.println("123");
				return 0;
			}
		};
		singer.name();
		singer.contact();

	}

}

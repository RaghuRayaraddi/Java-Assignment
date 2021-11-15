package com.technoelevate.java.anonymousclass;

public abstract class SingerAbstractClass {
	abstract void name();
	public static void main(String[] args) {
		SingerAbstractClass abstractClass=new SingerAbstractClass() {

			@Override
			void name() {
				// TODO Auto-generated method stub
				System.out.println("Raghu");
			}
			
		};
	}
}

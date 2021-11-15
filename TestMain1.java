package com.technoelevate.java.sundayassignment;
//Multilevel inheritance
public class TestMain1 {

	public static void main(String[] args) {
		ForexCard forexCard=new ForexCard();
		forexCard.cvv=456;
		forexCard.bal=1000;
		forexCard.rwpts=10000;
		forexCard.swipe();
		forexCard.payBill();
		forexCard.redeem();
	}

}

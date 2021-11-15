package com.technoelevate.java.sundayassignment;
//Hierarchical inheritance
public class TestMain2 {

	public static void main(String[] args) {
		DebitCard debitCard=new DebitCard();
		debitCard.cvv=159;
		debitCard.exyear=2022;
		debitCard.swipe();
		debitCard.withDraw();
		
		CreditCard card=new CreditCard();
		card.cvv=123;
		card.bal=50000;
		card.swipe();
		card.payBill();
		
	}

}

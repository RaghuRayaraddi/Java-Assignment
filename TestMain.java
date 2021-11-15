package com.technoelevate.java.sundayassignment;
//Singlelevel inheritance
public class TestMain {

	public static void main(String[] args) {
		CreditCard creditCard=new CreditCard();
		creditCard.name="ICICI";
		creditCard.cvv=123;
		creditCard.num=123457890l;
		creditCard.bal=50000;
		creditCard.swipe();
		creditCard.payBill();
	}

}

package com.technoelevate.java.exception;

public class BankAccount {
	double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public void withdraw(double amount) throws InsufficientBalance {
		if(amount<=balance){
		System.out.println("Successful withdraw");
		System.out.println("Balance="+(balance-amount));
	}
		else
         {
		throw new InsufficientBalance("The amount exceeds the balance amount");
	     }
	}
}

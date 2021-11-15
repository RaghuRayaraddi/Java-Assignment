package com.technoelevate.java.multithreading.synchronised;

public class Account {
	int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}
	public synchronized void withdraw(int amount) {
		if(amount > balance) {
			System.out.println("Insufficient Balance");
			return;
		}
		balance-=amount;
		System.out.println("Withdraw Successful");
		System.out.println("Balance="+balance);
		
	}
	public synchronized void deposite(int amount) {
		int temp=balance;
		temp +=amount;
		balance=temp;
		System.out.println("Deposited Successfully");
		System.out.println("Available balance ="+balance);
	}
	public void checkBalance() {
		System.out.println("Balance ="+balance);
		
	}
}

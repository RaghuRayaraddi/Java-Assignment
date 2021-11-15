package com.home.practice;

import java.util.Scanner;

public class StudentPercentage {
	double Perc;

	public StudentPercentage() {
	}
	
	public void verifyPrec(double perc) throws StudentPercentageException{
		if(perc>100||perc<0) {
			throw new StudentPercentageException("Your percentage is invalid !!!");
		}else {
			System.out.println("Your percentage is valid !!!");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = 1;
		while(x==1) {
		System.out.println("enter your percentage: ");
		double per = sc.nextDouble();
		StudentPercentage sp = new StudentPercentage();
		try {
			sp.verifyPrec(per);
		} catch (StudentPercentageException e) {
			System.out.println(e.msg);
		}finally {
			if(per>100||per<0) {
				System.out.println("please enter valid percentage.!!");
			}else {
				System.out.println("thank you.!!");
			}
		}
		x=0;
		System.out.println("Press 1 to enter again ");
		x= sc.nextInt();
	}
	}
}

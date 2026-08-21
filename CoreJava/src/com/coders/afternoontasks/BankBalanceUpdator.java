package com.coders.afternoontasks;

public class BankBalanceUpdator {

	public static void main(String[] args) {
		double balance = 25000;
		System.out.println("--------Transaction History--------");
		System.out.println("Current Balance is: " + balance);
		
		balance += 2000;
		System.out.println("After deposit Money: " + balance);
		
		balance -= 1000;
		System.out.println("After withdraw Money: " + balance);
		
		balance *= 2;
		System.out.println("After multiplied Money: " + balance);
		
		balance /= 5;
		System.out.println("After divided Money: " + balance);
		
		balance %= 6;
		System.out.println("Money: " + balance);
		
		

	}

}

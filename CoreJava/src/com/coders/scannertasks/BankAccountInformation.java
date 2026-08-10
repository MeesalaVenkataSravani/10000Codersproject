package com.coders.scannertasks;
import java.util.Scanner;
public class BankAccountInformation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Customer Account Number: ");
		long acct_number = sc.nextLong();
		
		System.out.println("Enter Customer IFSC Code: ");
		long code = sc.nextLong();
		
		sc.nextLine();
		
		System.out.println("Enter Customer Bank Name: ");
		String bank = sc.nextLine();
		
		System.out.println("");
		
		System.out.println("Name:"+name);
		System.out.println("Account Number:"+acct_number);
		System.out.println("IFSC Code:"+code);
		System.out.println("Bank Name:"+bank);
		

	}

}

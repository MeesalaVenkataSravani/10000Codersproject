package com.coders.scannertasks;
import java.util.Scanner;
public class ShoppingBillGenerator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Quantity of Product: ");
		int quantity = sc.nextInt();
		
		System.out.println("Enter Product price: ");
		int price  = sc.nextInt();
		
		double total_bill = quantity * price;
		
		System.out.println("Name of Product is: "+name);
		System.out.println("Quantity of Product is : "+quantity);
		System.out.println("Price of the Product is: "+price);
		System.out.println("Total bill: "+total_bill);
		sc.close();

	}

}

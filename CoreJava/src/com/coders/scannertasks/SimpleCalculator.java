package com.coders.scannertasks;
import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter Number: ");
		int b = sc.nextInt();
		
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Modulo");
		
		
		System.out.println("Enter Operation:");
		int operation=sc.nextInt();
		switch(operation) {
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
		case 5:
			System.out.println(a%b);
			break;
		default:
			System.out.println("Invalid");
		}
		sc.close();
		
	
		
	}

}

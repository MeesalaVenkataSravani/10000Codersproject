package com.coders.calculator;
import java.util.Scanner;
public class CalculatorProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int a = sc.nextInt();
		System.out.println("Enter b value: ");
		int b = sc.nextInt();
		System.out.println("Choose an Operation: ");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Modulo");
		
		System.out.println("Enter your Choice:");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Result = " + (a + b));
			break;
		case 2:
			System.out.println("Result = " + (a - b));
			break;
		case 3:
			System.out.println("Result = " + (a * b));
			break;
		case 4:
			System.out.println("Result = " + (a / b));
			break;
		case 5:
			System.out.println("Result = " + (a % b));
			break;
		
		}
	}

}

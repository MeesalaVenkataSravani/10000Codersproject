package com.coders.miniproject;
import java.util.Scanner;
public class MiniProject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = sc.nextInt();
		for (int i=1;i<=10;i++) {
			System.out.println(number + " x " + i + " = " + number*i);
		}
		sc.close();

	}

}

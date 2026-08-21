package com.coders.afternoontasks;
import java.util.Scanner;
public class PassorFailSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student name: ");
		String name = sc.next();
		
		System.out.print("Enter Student Marks: ");
		int marks = sc.nextInt();
		
		if (marks>=35) {
			System.out.println("Congratulations! "+ name + " You are PASSED");
		}
		else {
			System.out.println("FAIL");
		}
	}

}

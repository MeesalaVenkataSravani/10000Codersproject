package com.coders.afternoontasks;
import java.util.Scanner;
public class VotingEligibilityChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Citizen ID:");
		double id = sc.nextDouble();
		
		System.out.print("Enter Citizen Name:");
		String name = sc.next();
		
		
		System.out.print("Enter Citizen Age:");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("");
		System.out.println("----------------");
		System.out.println(" VOTING DETAILS ");
		System.out.println("----------------");
		System.out.println("Citizen ID is: " + id);
		System.out.println("Citizen name: "+name);
		System.out.println("Citizen age: "+age);
		
		if(age>=18) {
			System.out.println("Congratulations! " +name+ " You are eligible to vote");
		}
		

	}

}

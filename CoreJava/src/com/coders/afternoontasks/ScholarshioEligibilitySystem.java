package com.coders.afternoontasks;
import java.util.Scanner;
public class ScholarshioEligibilitySystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student Name: ");
		String name = sc.next();
		
		System.out.print("Enter percentage: ");
		double percentage = sc.nextDouble();
		
		System.out.print("Enter Attendance: ");
		float attendance = sc.nextFloat();
		System.out.println("Scholarship Amount is 25000");
		
		if (percentage>=75 && attendance>=80) {
			System.out.println("Scholarship Approved");
		}
		else{
			System.out.println("Not eligible");
			
		}

	}

}

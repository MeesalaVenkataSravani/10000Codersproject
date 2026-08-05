package com.coders.scholarship;
import java.util.Scanner;
public class ScholarshipEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Attendance Percentage: ");
        int attendance = sc.nextInt();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter Family Annual Income: ");
        int income = sc.nextInt();
		
        if (attendance>=85 && marks>=75 && income<300000) {
        	System.out.println("Congratulations!" + " " + name);
        	System.out.println("Scholarship Approved");
        }
        else {
        	System.out.println("Scholarship Rejected");
        	System.out.println("Reasons:");
        	if (attendance < 85) {
        		System.out.println("Attandance is below 85");
        	}
        	if (marks < 75) {
                System.out.println("Marks are below 75.");
            }

            if (income >= 300000) {
                System.out.println("Family income exceeds ₹3,00,000.");
            }
        	
        }
        sc.close();

	}

}

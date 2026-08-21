package com.coders.afternoontasks;
import java.util.Scanner;
public class StudentMarksComparision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student A Marks: ");
		int studenta = sc.nextInt();
		
		System.out.print("Enter Student B Marks: ");
		int studentb = sc.nextInt();
		
		 System.out.println("\n----- Comparison Results -----");

	     System.out.println("Student A < Student B: " + (studenta < studentb));

	     System.out.println("Student A == Student B: " + (studenta == studentb));

	     System.out.println("Student A != Student B: " + (studenta != studentb));

	     System.out.println("Student A >= Student B: " + (studenta >= studentb));

	     System.out.println("Student A <= Student B: " + (studenta <= studentb));

	     sc.close();
		
		

	}

}

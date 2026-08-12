package com.coders.afternoontasks;
import java.util.Scanner;
public class StudentRegistrationForm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Student Email: ");
		String email = sc.nextLine();
		
		System.out.print("Enter Student Mobile Number: ");
		long mobilenumber = sc.nextLong();
		sc.nextLine();
		
		System.out.print("Enter Student City: ");
		String city  = sc.nextLine();
		
		System.out.print("Enter Course Details: ");
		String course = sc.nextLine();
		System.out.println("");
		System.out.println("------Student Details------");
		System.out.println("Student Name: " + name);
		System.out.println("Student Email: " + email);
		System.out.println("Student Mobile Number: " + mobilenumber);
		System.out.println("Student City: " + city);
		System.out.println("Student Course: " + course);
		System.out.println("Student Registered Successfully..!");
		sc.close();

	}

}

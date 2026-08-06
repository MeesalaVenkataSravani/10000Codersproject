package com.coders.scannertasks;
import java.util.Scanner;
public class PersonalInformationCard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter City: ");
		String city = sc.nextLine();
		
		System.out.println("Enter State: ");
		String state = sc.nextLine();
		
		System.out.println("Enter Mobile Number: ");
		long number = sc.nextLong();
		
		sc.nextLine();
		
		System.out.println("Enter G-mail: ");
		String gmail = sc.nextLine();
		
		System.out.println(" ");
		System.out.println("-----Personal Information-----");
		System.out.println(name);
		System.out.println(city);
		System.out.println(state);
		System.out.println(number);
		System.out.println(gmail);
		sc.close();

	}

}

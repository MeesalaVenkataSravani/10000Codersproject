package com.coders.scannertasks;
import java.util.Scanner;
public class ScannerTasks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter ID: ");
		int id = sc.nextInt();
		
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Course: ");
		String course = sc.nextLine();
		
		System.out.println(" ");
		System.out.println("-----Student Details-----");
		
		System.out.println(name);
		System.out.println(id);
		System.out.println(age);
		System.out.println(course);
		sc.close();
		
	}
	
	

}

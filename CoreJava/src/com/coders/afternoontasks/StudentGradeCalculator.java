package com.coders.afternoontasks;
import java.util.Scanner;
public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student Name: ");
		String name = sc.next();
		
		System.out.print("Enter Student Marks:");
		int marks = sc.nextInt();
		
		if (marks>=90 && marks<=100) {
			System.out.println("Congratulations! "+ name +" You secured A+ grade");
		}
		else if (marks>=80 && marks<=89) {
			System.out.println("Congratulations! "+ name +" You secured A grade");
		}
		else if (marks>=70 && marks<=79) {
			System.out.println("Congratulations! "+ name +" You secured B grade");
		}
		else if (marks>=60 && marks<=69) {
			System.out.println("Congratulations! "+ name +" You secured C grade");
		}
		else if (marks>=50 && marks<=59) {
			System.out.println("Congratulations! "+ name +" You secured D grade");
		}
		else {
			System.out.println("Unfortunately! " + name + " You are Failed");
		}
		
		

	}

}

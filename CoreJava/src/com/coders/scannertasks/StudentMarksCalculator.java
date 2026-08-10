package com.coders.scannertasks;
import java.util.Scanner;
public class StudentMarksCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Subject1 marks: ");
		int marks1 = sc.nextInt();
		
		System.out.println("Enter Subject2 marks: ");
		int marks2 = sc.nextInt();
		
		System.out.println("Enter Subject3 marks: ");
		int marks3 = sc.nextInt();
		
		System.out.println("Enter Subject4 marks: ");
		int marks4 = sc.nextInt();
		
		System.out.println("Enter Subject5 marks: ");
		int marks5 = sc.nextInt();
		
		long total = marks1+marks2+marks3+marks4+marks5;
		double average = marks1+marks2+marks3+marks4+marks5/5;
		double percentage = total/500.0 * 100;
		
		System.out.println("Total Marks of Students: "+total);
		System.out.println("Average Marks of Students: "+average);
		System.out.println("Total Percentage of Students: "+percentage);
		sc.close();

	}

}

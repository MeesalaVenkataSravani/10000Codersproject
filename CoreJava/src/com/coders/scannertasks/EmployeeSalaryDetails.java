package com.coders.scannertasks;
import java.util.Scanner;
public class EmployeeSalaryDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Employee id: ");
		int id = sc.nextInt();
		
		System.out.println("Enter Employee salary: ");
		double salary = sc.nextDouble();
		
		double annualsalary = salary * 12;
		
		System.out.println("");
		System.out.println("-----Employee Details-----");
		System.out.println("Employee name: "+name);
		System.out.println("Employee id: "+id);
		System.out.println("Employee Salary: "+salary);
		System.out.println("Employee Annual Salary: "+annualsalary);
		sc.close();
		
		
		

	}

}

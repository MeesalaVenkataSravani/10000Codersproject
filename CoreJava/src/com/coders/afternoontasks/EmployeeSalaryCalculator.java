package com.coders.afternoontasks;
import java.util.Scanner;
public class EmployeeSalaryCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        double hra = basicSalary * 20 / 100;
        double da = basicSalary * 10 / 100;
        double pf = basicSalary * 12 / 100;

        
        double grossSalary = basicSalary + hra + da;

        
        double netSalary = grossSalary - pf;

        
        double annualSalary = netSalary * 12;

        System.out.println("\n----- Employee Salary Details -----");
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("PF: " + pf);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("Annual Salary: " + annualSalary);

        sc.close();

	}

}

package com.coders.loanapproval;
import java.util.Scanner;
public class LoanApprovalSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		String name = sc.nextLine(); 
		
		System.out.println("Enter Age:");
		int age = sc.nextInt();
		
		System.out.println("Enter Monthly Salary:");
		int Salary = sc.nextInt();
		
		System.out.println("Enter Credit Score:");
		int score = sc.nextInt();
		
		sc.nextLine(); 

        System.out.print("Existing Loan (Yes/No): ");
        String existingLoan = sc.nextLine();
        
        if (age >= 21 && age <= 60 &&
                Salary >= 30000 &&
                score >= 700 &&
                existingLoan.equalsIgnoreCase("No")) {

                System.out.println("\nCongratulations " + name + "!");
                System.out.println("Loan Approved.");
        }
        else {
        	System.out.println("Loan Rejected");
        	System.out.println("Reasons");
        	if (age < 21) {
                System.out.println("Applicant must be at least 21 years old.");
            }

            if (age > 60) {
                System.out.println("Applicant must not be older than 60 years.");
            }

            if (Salary < 30000) {
                System.out.println("Salary is below ₹30,000.");
            }

            if (score < 700) {
                System.out.println("Credit score is below 700.");
            }

            if (existingLoan.equalsIgnoreCase("Yes")) {
                System.out.println("Applicant already has an existing loan.");
            }
        }

        sc.close();
        }
        
		
	}
	



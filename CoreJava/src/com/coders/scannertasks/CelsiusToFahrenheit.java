package com.coders.scannertasks;
import java.util.Scanner;
public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Celsius Temperature: ");
		int temp = sc.nextInt();
		
		double convert = (temp*9/5)+32;
		System.out.println("After conversion:" + convert);
		sc.close();
		}

}

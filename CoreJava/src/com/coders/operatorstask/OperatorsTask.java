package com.coders.operatorstask;

public class OperatorsTask {

	public static void main(String[] args) {
		int a=8,b=6;
		//Arithmetic Operators(+,-,*,/,%)
		System.out.println("-----Arithmetic Operators-----");
		int sum = a+b;
		int sub = a-b;
		int multi = a*b;
		int div = a/b;
		int mod = a%b;
		System.out.println("Sum value: " + sum);
		System.out.println("Sub value: " + sub);
		System.out.println("Multi value: " + multi);
		System.out.println("Div value: " + div);
		System.out.println("Mod value: " + mod);
		System.out.println(" ");
		
		//Relational Operators(==,!=,>=,<=,>,<)
		System.out.println("-----Relational Operators-----");
		if (a==b) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		if (a!=b) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		if (a>=b) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		if (a<=b) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		if (a>b) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		if (a<b) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		System.out.println(" ");
		
		//Assignment Operators 
		System.out.println("-----Assignment Operators-----");
		int c = 6, d = 4;
		
		System.out.println(c);
		System.out.println(d);
		
		int e = 6, f = 4;
		e += 5;
		f -= 3;
		
		System.out.println(e);
		System.out.println(f);
		
		int g = 5, h=8;
		
		g *= 2;
		h /= 1;
		System.out.println(g);
		System.out.println(h);
		System.out.println(" ");
		
		//Logical Operators(&&,//,!)
		System.out.println("-----Logical Operators-----");
		int marks = 75;
		int attendance = 80;
		
		if (marks > 35 && attendance > 50) {
			System.out.println("Student Passed");
		}
		else {
			System.out.println("Student Failed");
		}
		
		if (marks > 35 || attendance > 50) {
			System.out.println("Student Passed");
		}
		else {
			System.out.println("Student Failed");
		}
		
		
		if (marks > 35 != attendance > 50) {
			System.out.println("Student Passed");
		}
		else {
			System.out.println("Student Failed");
		}
		System.out.println(" ");
		
		//Unary Operators
		System.out.println("-----Unary Operators-----");
		int s = 45;
		System.out.println(s++);
		System.out.println(s);
		System.out.println(++s);
		System.out.println(s--);
		System.out.println(s);
		System.out.println(--s);
		

	}

}

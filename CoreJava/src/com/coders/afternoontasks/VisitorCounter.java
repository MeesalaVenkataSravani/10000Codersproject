package com.coders.afternoontasks;

public class VisitorCounter {

	public static void main(String[] args) {
		int count = 56;
		System.out.println("Initial Count: "+ count);
		
		++count;
		System.out.println("Before Increment Count: "+ count);
		
		count++;
		System.out.println("After Increment Count: "+ count);
		
		--count;
		System.out.println("Before Decrement Count: "+ count);
		
		count--;
		System.out.println("After Decrement Count: "+ count);
		
		

	}

}

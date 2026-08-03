package com.coders.breakstatement;

public class BreakandContinue1 {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			if (i==5) 
				break;
			System.out.println("break");
			if (i%2 == 0) 
				continue;
			System.out.println("continue");
			
		
		System.out.println(i);
		}
	}

}

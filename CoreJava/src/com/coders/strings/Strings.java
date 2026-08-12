package com.coders.strings;

public class Strings {

	public static void main(String[] args) {
		String name = "ravi kumar";
		System.out.println("Length: " + name.length());
		System.out.println("Upper: " + name.toUpperCase());
		System.out.println("First: " + name.charAt(0));
		System.out.println("Has 'kumar': " + name.contains("kumar"));
		System.out.println(name.substring(1, 6));

	}

}

package com.java.oops;

public class StaticFlow {
	// Rules
	
	// 1. Identification of static members from top to bottom
	// 2. Execution of static variable assignments & static blocks from top to bottom
	// 3. Execution of main method
	
	static int i=10;
	static {
		m1();
		System.out.println("1st static block");
	}
	public static void main(String[] args) {
		m1();
		System.out.println("Main Method");
	}
	public static void m1() {
		System.out.println(j);
	}
	static {
		System.out.println("2nd static block");
	}
	static int j=20;
}

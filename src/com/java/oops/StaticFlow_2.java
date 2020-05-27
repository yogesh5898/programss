package com.java.oops;

public class StaticFlow_2 {
 static int i=10;
 	static {
 		m1();
 		System.out.println(i); // ----> direct reading
 	}
 	public static void main(String[] args) {
		System.out.println("Main method");
	}
 	public static void m1() {
 		System.out.println(i +" checking");  // ----> Indirect reading
 	}
 	
}

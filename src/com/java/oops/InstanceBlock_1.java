package com.java.oops;

public class InstanceBlock_1 {
	
// 	without creating object instance block won't be executed.	
	
	int i=10;
	{
		m1();
		System.out.println("First instance block");
	}
	InstanceBlock_1(){
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		System.out.println("Main method");
	}
	public void m1() {
		System.out.println(j);
	}
	{
		System.out.println("Second instance block");
	}
	int j = 44;
}

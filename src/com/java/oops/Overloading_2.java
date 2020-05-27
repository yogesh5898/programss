package com.java.oops;

public class Overloading_2 {
	public void m1(String s) {
		System.out.println(s);
	}
	public void m1(Object o) {
		System.out.println(o);
	}
	public static void main(String[] args) {
		Overloading_2 o = new Overloading_2();
		o.m1("praveena");	
		o.m1(new Object()); 	
		o.m1(null);			//String version     
					//bcoz both string & object has "null" String(child) got priority
					//object(parent) 
				
	}
}

package com.java.oops;

public class Overloading_1 {
	public void m1(int i) {
		System.out.println(i);
	}
	public void m1(float i) {
		System.out.println("Float method");
	}
	public static void main(String[] args) {
		Overloading_1 o = new Overloading_1();
		o.m1(5);
		o.m1(3.5f);
		o.m1('a');  //Automatic class promotion  
							//char->int->long->float->double
							//byte->short->int	
	//	o.m1(5.5);   I get compile time error bcoz double cannot convert to next level 
	}
}

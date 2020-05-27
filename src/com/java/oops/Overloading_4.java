package com.java.oops;

public class Overloading_4 {
	public void m(int i, float f) {
		System.out.println(i+f);
	}
	public void m(float f, int i) {
		System.out.println(f+i);
	}
	public static void main(String[] args) {
	
	Overloading_4 o = new Overloading_4();
	o.m(1,1.5f);
	o.m(1.5f, 1);
//	o.m(1, 1);    Ambiguity problem 
//	o.m(1.5f, 1.5f);	cannot find symbol occurs eventhough class promotion used
	}
}

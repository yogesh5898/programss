package com.java.oops;

public class Overloading_5 {
	public void m(int i) {
		System.out.println(i);
	}
	public void m(int... i) {
		System.out.println(i);
	}
	public static void main(String[] args) {
		Overloading_5 o = new Overloading_5();
		o.m();		//var-arg method
		o.m(3,4,6,7);  //var-arg method
		o.m(5);	//int method
	}
}

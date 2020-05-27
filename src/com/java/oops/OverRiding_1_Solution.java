package com.java.oops;

public class OverRiding_1_Solution extends OverRiding_1 {
	public void marriage() {
		System.out.println("Who knows");
	}
	public static void main(String[] args) {
		OverRiding_1_Solution o = new OverRiding_1_Solution();
		o.marriage();
		
		OverRiding_1 oo = new OverRiding_1();
		oo.marriage();
		
		OverRiding_1 ooo	 = new OverRiding_1_Solution();
		ooo.marriage();       // based on runtime objects
	}
}

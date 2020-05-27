package com.java.oops;

public class Overloading_3 {
	public void m1(String s) {
		System.out.println(s);
	} 
	public void m1(StringBuffer sb) {
		System.out.println(sb);
	}
	public static void main(String[] args) {
	
	Overloading_3 o = new Overloading_3();
	o.m1("lusu");
	o.m1(new StringBuffer("yoki"));
	
//  o.m1(null);    Amiguity problem occur both string & stringBuffer are in same level 
				// 	so it get confuse which method to execute first
}
}
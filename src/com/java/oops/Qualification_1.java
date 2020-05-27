package com.java.oops;

public class Qualification_1 extends Person_1{
	String degree;
	String college;
	int studentId;
	
	Qualification_1(String name,String location, int mobileNo, String degree,
				String college, int studentId){
		this.name = name;
		this.location = location;
		this.mobileNo = mobileNo;
		this.degree = degree;
		this.college = college;
		this.studentId = studentId;
	}
	
public static void main(String[] args) {
	Qualification_1 q = new Qualification_1("yogesh", "salem", 96982, "ECE", "ksriet", 84);
	
	System.out.println(q.name);
}
}

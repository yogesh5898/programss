package com.java.oops;

public class Job_2 extends Bestie_2{
	String company;
	String position;
	int salary;
	
	public Job_2(String name,int mobileNumber, String chocolate, 
			String actor, String color, String company, String position, int salary) {
		super(name, mobileNumber, chocolate, actor, color);
		this.company = company;
		this.position = position;
		this.salary = salary;
	}
	public static void main(String[] args) {
		Job_2 j = new Job_2("praveena", 75388, "dairymilk", "Surya", "blue",
				"molecular Connection", "Manager", 100000);
		
		System.out.println(j.name);
	}
	
}

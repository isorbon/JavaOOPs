package com.syntax.class15;

public class SyntaxStudent {
	
	static String school = "Syntax"; // in this exp. because school not changes
	int durationOfCourse = 6; 
	String name; // instance
	String id;
	void calculateFee() {
		int currentMonth = 3;
		double tax = .10;
		System.out.println(name + " has to pay" + currentMonth+1000+1000*tax);
	
	}
	
	
}

package com.syntax.class15;

public class TypesVariables {
	// All methods inside local variables 
	
	String name; // Instance variable
	String color; // Instance variable
	static int noOfLegs;

	void sleep() {
		int time = 3;
		System.out.println(time);
		System.out.println(name + " is sleeping");
	}

	void eat() {
		// System.out.println(time); as time is local variable we can not access it
		// outside of sleep method
		System.out.println(name + " can eat");
	}
}

package com.syntax.class16;

public class Dog {
	String name;
	static int noOfLegs = 4;
	String color;
	
	void displayColor() {
		System.out.println(color);
	}
	void displayName() {
		System.out.println(name);
	}
	
	void printInfo() {
		displayName();
		displayColor();
		DisplayLegs();
	}
	
	static void DisplayLegs() {
		System.out.println(noOfLegs);
	} 
}

package com.syntax.class11;

//Creating an Car class
public class Car {
	
	String make;
	String model;
	String color;
	int year;
	double millage;
	
	void moveFroward() {
		System.out.println("Moving forward");
		// applyBrekes(); method inside another method
	}
	void applyBrekes() {
		System.out.println("Applying brakes");
	}
	
	public static void main(String[] args) {
		
		Car ayshaCar = new Car();
		ayshaCar.make = "Tesla";
		ayshaCar.model = "S";
		ayshaCar.color = "Black";
		
		System.out.println("Ayshas Car is " + ayshaCar.make);
		System.out.println("Ayshas Car model is " + ayshaCar.model);
		System.out.println("Ayshas Car color is " + ayshaCar.color);
		ayshaCar.moveFroward();
		ayshaCar.applyBrekes();
	}

}

package com.syntax.class11;

//Creating an Phone class
public class Phone {
	/*
	 * HOMEWORK 01. Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia with
	 * specific attributes and behaviors.
	 */

	String name, model, oS, color;
	int memory, ram, frontСamera, mainCamera, weight;
	double diagonal;

	void speed() {
		System.out.println(name + " " + model + " with fast " + oS + " and " + ram + "/" + memory + " Gb memory");
	}

	void camera() {
		System.out.println("The main camera of " + name + " " + model + " is " + mainCamera
				+ " Mp. and the Front-camera is " + frontСamera + " Mp.");
	}

	void design() {
		System.out.println("Display of " + color + " " + name + " " + model + " is " + diagonal + "\"");
	}

	void weightPhone() {
		System.out.println("The weight of " + name + " " + model + " is " + weight + " gr.");
	}

}

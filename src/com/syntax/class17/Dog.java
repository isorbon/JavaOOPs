package com.syntax.class17;

public class Dog {
	
	private String name;
	private String color;
	private String breed;
	private int age;
	private double weight;
	
	public Dog() { // Default Constructer		
	}
	
	public Dog(String dogname, String dogcolor, String dogbreed, int dogage, double weightDog) { // creating the constructer
		System.out.println("Dogs constructers is called");
		name=dogname;
		color=dogcolor;
		breed=dogbreed;
		age=dogage;
		weight=weightDog;
		System.out.println(dogname);
		printAge();
	}
	
	public void printName() {
		System.out.println(name);
	} 
	public void printBreed() {
		System.out.println(breed);
	} 
	public void printAge() {
		System.out.println(age);
	} 
}

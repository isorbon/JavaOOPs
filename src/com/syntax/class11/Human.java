package com.syntax.class11;

//Creating an Human class
public class Human {
	
	String name;
	int age;
	double height;
	double weight;
	char gender;
	String bloodType;
	
	void eat() {
		System.out.println(name + " eats a lot");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
	void walk() {
		System.out.println(name + " with bloodtype " + bloodType + " is wlaking");
	}
	void sendMemes() {
		if(name.equals("Sebastian")) {
			System.out.println("sending memes");
		}
	}
	
	
	
}

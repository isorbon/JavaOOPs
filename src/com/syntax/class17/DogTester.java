package com.syntax.class17;

public class DogTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new Dog(); // calling the constructor
		// new dog("Bobby", "black", 10); // -this is also a way to call constructor
		
		Dog dog = new Dog("Bob", "Black", "Husky", 9, 14.2); // creating object
		dog.printName();
		dog.printAge();
		
	}

}

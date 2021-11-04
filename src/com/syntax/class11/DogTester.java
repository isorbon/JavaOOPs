package com.syntax.class11;

public class DogTester {

	public static void main(String[] args) {

		// Creating an object of Dog class

		Dog zemasDog = new Dog();
		zemasDog.name = "Lexy";
		zemasDog.breed = "american hound";
		zemasDog.color = "Black";
		zemasDog.height = 2.5;
		zemasDog.age = 10;
		zemasDog.gender = 'M';

		System.out.println("My Dog Name is " + zemasDog.name);
		System.out.println("His Breed is " + zemasDog.breed);
		System.out.println("His color is " + zemasDog.color);
		System.out.println("His height is " + zemasDog.height);

		Dog jimmysDog = new Dog();
		jimmysDog.name = "Teddy";
		jimmysDog.breed = "Labrador";
		jimmysDog.color = "Golden";
		jimmysDog.age = 5;

		System.out.println("My Dog Name is " + jimmysDog.name);
		System.out.println("His Breed is " + jimmysDog.breed);
		System.out.println("His color is " + jimmysDog.color);
		System.out.println("Jimmys Dog age is " + jimmysDog.age);
		
		Dog arwasDog = new Dog();
		arwasDog.name = "Manroe";

		System.out.println("Arwas Dog Name is " + arwasDog.name);

	}

}

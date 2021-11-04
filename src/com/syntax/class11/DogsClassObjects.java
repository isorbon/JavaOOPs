package com.syntax.class11;

public class DogsClassObjects {

	/*
	 * HOMEWORK 02. Create a Dog Class and create 3 different objects of it: Husky, Bulldog,
	 * Labrador with specific attributes and behaviors.
	 */
	String name;
	String breed;
	String color;
	double height;
	double weight;
	int age;

	void definition() {
		if (name.equals("Balto")) {
			System.out.println("The " + breed + " is a medium-sized working sled dog breed.");
		} else if (name.equals("Spike")) {
			System.out.println("The " + breed
					+ " is a muscular, hefty dog with a wrinkled face and a distinctive pushed-in nose.");
		} else if (name.equals("Bella")) {
			System.out.println("The " + breed
					+ " is a breed of retriever gun dog from the United Kingdom that was developed from imported Canadian fishing dogs.");
		}
	}

	void barking() {
		System.out.print(name + " is a " + breed + " and it barks ");
		if (name.equals("Balto")) {
			System.out.println("rarely");
		} else if (name.equals("Spike")) {
			System.out.println("very rarely");
		} else if (name.equals("Bella")) {
			System.out.println("often");
		}
	}

	void appearance() {
		System.out.println("The color of " + name + " is " + color);
	}

	public static void main(String[] args) {

		// Creating an Husky object of DogsClassObjects class

		DogsClassObjects husky = new DogsClassObjects();
		husky.name = "Balto";
		husky.breed = "Siberian Husky";
		husky.color = "Black & White";
		husky.height = 56;
		husky.weight = 26;
		husky.age = 11;

		husky.definition();
		husky.barking();
		husky.appearance();

		System.out.println("The size of " + husky.name + ": height - " + husky.height + " cm and weight - "
				+ husky.weight + " kg");
		System.out.println("The age of " + husky.name + " is " + husky.age + " years old");

		System.out.println("------------------------------------");

		// Creating an Bulldog object of DogsClassObjects class

		DogsClassObjects bullDog = new DogsClassObjects();
		bullDog.name = "Spike";
		bullDog.breed = "English bulldog";
		bullDog.color = "Red & White";
		bullDog.height = 35;
		bullDog.weight = 20;
		bullDog.age = 8;

		bullDog.definition();
		bullDog.barking();
		bullDog.appearance();

		System.out.println("The size of " + bullDog.name + ": height - " + bullDog.height + " cm and weight - "
				+ bullDog.weight + " kg");
		System.out.println("The age of " + bullDog.name + " is " + bullDog.age + " years old");

		System.out.println("------------------------------------");

		// Creating an Labrador object of DogsClassObjects class

		DogsClassObjects labrador = new DogsClassObjects();
		labrador.name = "Bella";
		labrador.breed = "Labrador";
		labrador.color = "Yellow";
		labrador.height = 58;
		labrador.weight = 28;
		labrador.age = 10;

		labrador.definition();
		labrador.barking();
		labrador.appearance();

		System.out.println("The size of " + labrador.name + ": height - " + labrador.height + " cm and weight - "
				+ labrador.weight + " kg");
		System.out.println("The age of " + labrador.name + " is " + labrador.age + " years old");

	}
}

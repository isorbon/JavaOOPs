package com.syntax.class16;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog1 = new Dog();
		dog1.name = "Casper";
		dog1.displayName();
		
		Dog dog2 = new Dog();
		dog2.name = "Babli";
		dog2.displayName();
		
		Dog dog3 = new Dog();
		dog3.name = "Oban";
		dog3.displayName();
		
		Dog.DisplayLegs();
	}

}

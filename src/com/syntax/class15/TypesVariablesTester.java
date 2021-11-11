package com.syntax.class15;

public class TypesVariablesTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TypesVariables dog = new TypesVariables();
		dog.name = "Casper";
		dog.color = "Black";
		dog.sleep();
		dog.eat();
		dog.noOfLegs = 4;
		
		TypesVariables dog2 = new TypesVariables();
		dog2.name = "Casper";
		dog2.color = "Black";
		dog2.sleep();
		dog2.eat();
		System.out.println(dog2.noOfLegs);
		System.out.println(dog2.name);
		
	}

}

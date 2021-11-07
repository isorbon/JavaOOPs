package com.syntax.class12;

public class Methods2Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methods2 methods = new Methods2();
		// methods.repeatWords(5,"Hi"); Error sequence not followed
		methods.repeatWords("Hi", 5);
		methods.repeatWords("I love programming ", 3);

		methods.isItRaining(false);

		methods.advanceMethod(new Methods());

	}

}

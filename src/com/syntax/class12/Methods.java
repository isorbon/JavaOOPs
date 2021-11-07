package com.syntax.class12;

public class Methods {
	int times = 5;

	void sayHello() {
		System.out.println("Hello Btach 11");
	}

	void sayHelloManyTimes() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello Btach 11");
		}
	}

	void sayHelloManyTimesWithState() {
		for (int i = 0; i < times; i++) {
			System.out.println("Hello Btach 11");
		}
	}

	void sayHelloManyTimesWithParameter(int times) {
		for (int i = 0; i < times; i++) {
			System.out.println("Hello Btach 11");
		}
	}
}

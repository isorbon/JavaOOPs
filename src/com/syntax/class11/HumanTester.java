package com.syntax.class11;

import java.util.Scanner;

public class HumanTester {

	public static void main(String[] args) {
		// Creating an object of Human class
	
		Human tamanna = new Human();
		tamanna.name = "Tamanna";
		tamanna.age = 16;
		tamanna.height = 5.8;
		tamanna.weight = 30;
		tamanna.gender = 'F';
		tamanna.bloodType ="A+";
		
		tamanna.eat();
		tamanna.sleep();
		tamanna.walk();
		
		System.out.println("********");
		
		Human sebastian = new Human();
		sebastian.name = "Sebastian";
		sebastian.age = 18;
		sebastian.height = 6.2;
		sebastian.weight = 100;
		sebastian.gender = 'M';
		sebastian.bloodType="A-";
		
		sebastian.eat();
		sebastian.sleep();
		sebastian.walk();
		sebastian.sendMemes();
		
		Scanner inp = new Scanner(System.in);
		
		
	}

}

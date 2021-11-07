package com.syntax.class12;

import java.util.Scanner;

public class HomeWork01 {
	//Create a method that will take 2 parameters as a numbers and prints which number is larger
	
	int getLarge(int numA, int numB) {

		if (numA < numB) {
			return numB;
		} else {
			return numA;
		}
	}
	
	public static void main(String[] args) {
		// Created Object of HomeWork01 class
		
		HomeWork01 larger = new HomeWork01();
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int num1 = inp.nextInt();
		System.out.print("Enter number 2: ");
		int num2 = inp.nextInt();
		
		System.out.print("The largest number is: ");
		int large = larger.getLarge(num1, num2);
		System.out.println(large);
	}
}

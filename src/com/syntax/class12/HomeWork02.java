package com.syntax.class12;

import java.util.Scanner;

public class HomeWork02 {
	// Create a method that will take a number and prints whether the number is even
	// or odd

	void numbers(int num) {
		if(num % 2 == 0) {
			System.out.println("The number " + num + " is Even");
		}else {
			System.out.println("The number " + num + " is Odd");
		}
	}
	
	public static void main(String[] args) {
		// The object of HomeWork02 class
		
		HomeWork02 evenOdd = new HomeWork02();
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter you number: ");
		int num = inp.nextInt();
		
		evenOdd.numbers(num);
		
	}
}

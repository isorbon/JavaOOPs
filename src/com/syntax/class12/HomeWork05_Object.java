package com.syntax.class12;

import java.util.Scanner;

public class HomeWork05_Object {

	public static void main(String[] args) {
		// Created Object of HomeWork05 class

		HomeWork05 numberPrime = new HomeWork05();
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter a number to check it is Prime or not: ");
		int num = inp.nextInt();
		
		if (numberPrime.methodPrime(num)) {
			System.out.println(num + " is Prime ");
		} else {
			System.out.println(num + " is not Prime ");
		}

	}

}

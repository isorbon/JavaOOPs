package com.syntax.class12;

import java.util.Scanner;

public class HomeWork05 {
	//Write a method to return whether given number is prime or not?
	
	void methodPrime(int num, boolean isPrime) {
		if (num > 1) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
		} else {
			isPrime = false;
		}

		if (isPrime) {
			System.out.println(num + " is Prime ");
		} else {
			System.out.println(num + " is not Prime ");
		}
	}

	public static void main(String[] args) {
		// Created Object of HomeWork05 class
		
		HomeWork05 numberPrime = new HomeWork05();
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter a number to check it is Prime or not: ");
		int num = inp.nextInt();
		numberPrime.methodPrime(num, true);
		
	}
}	

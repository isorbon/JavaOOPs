package com.syntax.class12;

import java.util.Scanner;

public class HomeWork05 {
	//Write a method to return whether given number is prime or not?
	
	boolean methodPrime(int num) {
		boolean isPrime = true;
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
		return isPrime;
	}

}	

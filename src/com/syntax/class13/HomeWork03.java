package com.syntax.class13;

import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {
		/*
		 * Create a String and print it in reverse order (Sunday → yadnuS).
		 */

		Scanner inp = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String str = inp.next();

		System.out.print(str + " → ");

		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		System.out.print(reverse);
	}

}

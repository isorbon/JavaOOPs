package com.syntax.class13;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		/*
		 * Create a String and if the String is not empty perform the following: if the
		 * String has an odd number of characters and has 3 or more characters, print
		 * the character in the middle of the String.
		 */
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String str = inp.next();

		if (!str.isEmpty()) {
			if ((str.length() % 2 != 0) && str.length() >= 3) {
				int len = str.length();
				int middle = len / 2;
				System.out.println("The character in the middle is: " + str.charAt(middle));
			} else {
				System.out.println("Your word has an even number of characters or less than 3. Enter another word");
			}
		}

	}

}

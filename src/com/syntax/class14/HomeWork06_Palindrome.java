package com.syntax.class14;

import java.util.Scanner;

public class HomeWork06_Palindrome {

	public static void main(String[] args) {
		// How would you check if String is Palindrome or not?

		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String str = inp.nextLine();

		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		if (str.equalsIgnoreCase(reverse)) {
			System.out.println(str + " is a Palindrome");
		} else {
			System.out.println(str + " is not Palindrome");
		}

		// or do with StringBuilder class like this:
		
		StringBuilder strB = new StringBuilder(str);
		strB.reverse();
		if (str.equals(strB.toString())) {
			System.out.println(str + " is palindrome");
		} else {
			System.out.println(str + " is Not palindrome");
		}

	}
}

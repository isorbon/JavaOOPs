package com.syntax.class14;

public class HomeWork04 {

	public static void main(String[] args) {
		/* How would you reverse a String character by character? */

		String str = "Java String character";

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

}

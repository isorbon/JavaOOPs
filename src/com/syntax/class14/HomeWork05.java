package com.syntax.class14;

import java.util.Arrays;

public class HomeWork05 {

	public static void main(String[] args) {
		// How would you reverse a String word by word?

		String a = "How would you reverse a String word by word?";
		String[] str = a.split(" ");

		for (int i = str.length - 1; i >= 0; i--) {
			System.out.print(str[i] + " ");
		}

		System.out.println();

		// or with StringBuilder and for each loop

		for (String s : str) {
			StringBuilder strarray = new StringBuilder(s);
			System.out.print(strarray.reverse() + " ");
		}
	}
}

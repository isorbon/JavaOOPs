package com.syntax.class14;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		/*
		 * Create a String that will hold a sentence. Write a program to get a new
		 * String without any spaces.
		 */
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter any sentence: ");
		String str = inp.nextLine();
		
		System.out.println(str.replaceAll(" ", ""));

	}

}

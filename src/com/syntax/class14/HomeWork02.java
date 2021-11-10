package com.syntax.class14;

public class HomeWork02 {

	public static void main(String[] args) {
		/*
		 * Create a String that should be combination of letters, numbers and special
		 * characters. Find out how many alpha characters are there in the String.
		 */
		String str = "asafasfafFSHFJSFFDSDJFSDFS465463216541!@$(*#&$^#&#";
		
		System.out.println(str.replaceAll("[^a-zA-Z]", "").length());

	}
}

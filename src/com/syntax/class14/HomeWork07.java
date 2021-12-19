package com.syntax.class14;

public class HomeWork07 {

	public static void main(String[] args) {
		// How would you swap 2 strings without a temporary variable?

		String str1 = "Java world";
		String str2 = "I like";

		str1 = str1 + str2; // Java world I like
		str2 = str1.substring(0, (str1).length() - str2.length()); // Java world
		str1 = str1.substring(str2.length()); // I like
		
		// or do it easier 
		str1 = str1 + str2; 
		str2 = str1.replace(str2, ""); 
		str1 = str1.replace(str2, ""); 
		
		System.out.println(str1);
		System.out.println(str2);
		
	}
}

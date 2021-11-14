package com.syntax.class16;

public class Task2 {
	/*
	 * Create a method that will take a String as a parameter and returns reversed
	 * String. Method should be available to all classes within your project and
	 * accessible by class name.
	 */
	
	public static String revers(String str) {
		return new StringBuilder(str).reverse().toString();
		
		/*
		 StringBuffer str = new StringBuffer(rev);
		 str.reverse();
	     return str.toString();
	    */
	}
}

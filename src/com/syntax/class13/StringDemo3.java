package com.syntax.class13;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "This class is easy";
		System.out.println(name.contains("class")); //it's checking there word/character in variable is
		System.out.println(name.contains("Lemon"));
		System.out.println(name.contains("i"));
		
		System.out.println();
		String str2 = "Hello";
		String str3 = "hello";
		System.out.println(str2.equals(str3));
		System.out.println(str2.equalsIgnoreCase(str3));
		
		System.out.println();
		System.out.println(str2.charAt(0));
		System.out.println(str3.toUpperCase().charAt(0));
		
		System.out.println();
		System.out.println(str2.indexOf('e'));
		System.out.println(str2.indexOf('l', 3)); // starts the search from 3 index
		System.out.println(str2.indexOf('l', str2.indexOf('e')+1)); // starts the search from 1 index
		
		System.out.println();
		System.out.println(name.substring(5)); // ignores first 5 letters
		System.out.println(name.substring(5, 11)); // ignores first 5 letters and after 11
		
	}

}

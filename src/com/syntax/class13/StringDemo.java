package com.syntax.class13;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = new String("Sebastian");
		String name1 = "Mykl";
		System.out.println(name.length());
		System.out.println(name1.length());
		
		System.out.println();
		System.out.println(name1.toLowerCase());
		System.out.println(name1.toUpperCase());
		
		System.out.println();
		
		String str = "This is easy";
		System.out.println(str.toLowerCase());
		
		System.out.println(name.concat(name1)); // not recommended to use always 
		int number = 10;
		System.out.println(name.concat(name1 + " ").concat("   cv") + number); 
		
	}

}

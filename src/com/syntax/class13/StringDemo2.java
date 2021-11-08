package com.syntax.class13;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "";
		System.out.println(name.isEmpty());
		name = "Silva";
		System.out.println(name.isEmpty());
		
		String str = "        Batch 11 is ...   ";
		System.out.println(str.trim()); // removing all spaces before and after variable
		
		System.out.println();
		String str2 = "This is an easy class";
		System.out.println(str2.startsWith("T"));
		System.out.println(str2.startsWith("This"));
		System.out.println(str2.startsWith("L"));
		
		System.out.println();
		System.out.println(str2.endsWith(str2));
		System.out.println(str2.endsWith("easy"));
		System.out.println(str2.endsWith("s"));
		System.out.println(str2.endsWith("class"));
	}

}

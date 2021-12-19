package com.syntax.class14;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "asafasfafFSHFJSFFDSDJFSDFS465463216541!@$(*#&$^#&#";
		System.out.println(str.replaceAll("[012345]", "*"));
		System.out.println(str.replaceAll("[0-5]", "*")); // or we can do like this
		System.out.println(str.replaceAll("[a-z]", "*")); // or replaces all letters lowcase
		System.out.println(str.replaceAll("[A-Z]", "*")); // or replaces all letters uppercase
		System.out.println(str.replaceAll("[A-Za-z]", "*")); // replaces all letters 
		System.out.println(str.replaceAll("[A-Z]", "*").replaceAll("[a-z]", "*")); // or like this one
		System.out.println(str.replaceAll("[A-Za-z0-9]", "*")); // replaces all letters and all numbers
		System.out.println(str.replaceAll("[^A-Za-z0-9]", "*")); // replaces all EXCEPT letters and numbers
		System.out.println(str.replaceAll("[^ ]", "*")); // replaces absolutely all characters
		System.out.println(str.replaceAll("[0-9]", "")); // remove all characters
		System.out.println(str.replaceAll("[^ ]", "")); // remove absolutely all characters

		String word ="abrakadabra";

		String replace=word.replaceAll("[^aAeEiIoOuU]", " ");

		System.out.println(replace);
	}	

}

package com.syntax.class14;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is Batch 11 Batch is great";
		System.out.println(str.replace("good", "Great"));
		str = "This is Batch 11 is good Batch is good";
		System.out.println(str.replace("good", "Great").replace("Batch", "Not Batch"));
		
		System.out.println(str.replaceFirst("good", "Great")); //replaces only first matches
	}

}

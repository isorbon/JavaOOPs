package com.syntax.class15;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder stringBuilder = new StringBuilder();
		
		for(int i=0; i<5; i++) {
			stringBuilder.append(i);
		}
		System.out.println(stringBuilder);
		
		String str = "Today the Class 15";
		StringBuilder strBuilder = new StringBuilder(str);
		strBuilder.reverse();
		System.out.println(strBuilder);
		
		StringBuilder str2 = new StringBuilder("I like Java class");
		System.out.println(str2.reverse());
		System.out.println(str2);
		
   // When you have to change the value of a String variable always use StringBuilder class
   // String is not recommended because every time it will search the memory and that will slow down the code
		/*when the value of variable changing multiple times then we use StringBuilder
		 * StringBuilder class is used to create mutable (modifiable) string
		 * String class is immutable. Immutable means unmodifiable or unchangeable
		*/
	}

}

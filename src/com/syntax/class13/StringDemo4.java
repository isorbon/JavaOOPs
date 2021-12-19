package com.syntax.class13;

import java.util.Arrays;

public class StringDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is Batch 11 Batch is great";
		String [] arr = str.split(" ");
		
		System.out.println(arr[0]);
		
		String str2 = "This is Batch 11. Batch is great";
		String [] arr2 = str2.split("[.]"); // search the match with previous String and splits
		
		for(String array:arr2) {
			System.out.println(array);  // loop shows all split element of array
		}
		System.out.println(Arrays.toString(arr2)); // that puts comma between splits 
		
		System.out.println(arr2[1]);
		
		/*
		 * for(String word:str) {
			System.out.println(word);
		}
		 */
		
	}

}

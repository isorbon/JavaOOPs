package com.syntax.class13;

public class StringDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is Batch 11 Batch is great";
		String [] arr = str.split(" ");
		
		System.out.println(arr[0]);
		
		String str2 = "This is Batch 11. Batch is great";
		String [] arr2 = str2.split("[.]");
		
		System.out.println(arr2[1]);
		
		/*
		 * for(String word:str) {
			System.out.println(word);
		}
		 */
		
	}

}

package com.syntax.class13;

public class MethodsDemo {
	
	int add(int num1, int num2) {
		return num1+num2;
	}
	
	int[] doubleArray(int [] arr) {
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr[i]*2;
		}
		return arr;
	}
}

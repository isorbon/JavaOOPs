package com.syntax.class13;

import java.util.Arrays;

public class MethodsDemoTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsDemo obj = new MethodsDemo();
		//obj.add(10, 10);
		System.out.println(obj.add(10, 10));
		
		int[] array = {10, 10, 10};
		
		array = obj.doubleArray(array);
		System.out.println(Arrays.toString(array));
		
	}

}

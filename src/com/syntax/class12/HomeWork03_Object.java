package com.syntax.class12;

import java.util.Scanner;

public class HomeWork03_Object {

	public static void main(String[] args) {
		// Created object
		
		Scanner inp = new Scanner(System.in);
		
		HomeWork03 hello = new HomeWork03();
		System.out.print("The name of country: ");
		String country = inp.next();
		
		hello.wordHello(country);
		
	}

}

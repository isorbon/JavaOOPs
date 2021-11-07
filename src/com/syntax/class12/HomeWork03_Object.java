package com.syntax.class12;

import java.util.Scanner;

public class HomeWork03_Object {

	public static void main(String[] args) {
		// Created object
		
		HomeWork03 hello = new HomeWork03();
		Scanner inp = new Scanner(System.in);
		System.out.print("The name of country: ");
		String country = inp.next();
		
		hello.wordHello(country);
		
	}

}

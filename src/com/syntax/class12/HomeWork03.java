package com.syntax.class12;

public class HomeWork03 {
	// Create a method that will say Hello in different language based on the
	// country that will passed when method is executed.
	
	void wordHello(String country) {
		if(country.equalsIgnoreCase("Ukraine")) {
				System.out.println("Привіт");
			}else if(country.equalsIgnoreCase("Brasil")) {
				System.out.println("Olá");
			}else if(country.equalsIgnoreCase("Tajikistan")) {
				System.out.println("Салом");
			}else if(country.equalsIgnoreCase("Spain")) {
				System.out.println("Hola");
			}else if(country.equalsIgnoreCase("France")){
				System.out.println("Bonjour");
			}else {
				System.out.println("Try again and enter another name of country");
			}
		
	}
}

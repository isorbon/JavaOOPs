package com.syntax.class13;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads two people's first names and if they expecting boy
		 * or girl? Based on the input suggests a name for a baby
		 */
		Scanner inp = new Scanner(System.in);
		System.out.print("Mom’s first name: ");
		String nameMom = inp.next();
		System.out.print("Dad’s first name: ");
		String nameDad = inp.next();
		System.out.print("Boy or Girl: ");
		String gender = inp.next();

		if (gender.equalsIgnoreCase("boy")) {
			System.err.println(
					"Suggested baby name: " + nameDad.substring(0, 3) + nameMom.substring(nameMom.length() - 3));
		} else if (gender.equalsIgnoreCase("girl")) {
			System.out.println("Suggested baby name: " + nameMom.substring(0, 2)
					+ nameDad.toLowerCase().substring(nameDad.length() - 4));
		} else {
			System.out.println("Please try again and enter a correct gender");
		}
			
		// Asghar done 
		
		String fathersName="Daniel"; //7/2=>3
		String mothersName="Mary"; //2
		String isBoyGirl="girl";
		if(isBoyGirl.equalsIgnoreCase("Boy")) {
			String firstPart=fathersName.substring(0,fathersName.length()/2);
			String secondPart=mothersName.substring(mothersName.length()/2);
			System.out.println(firstPart+secondPart);
		}else {
			String firstPart=mothersName.substring(0,fathersName.length()/2);
			String secondPart=fathersName.substring(mothersName.length()/2);
			System.out.println(firstPart+secondPart);
		}
		
	}

}

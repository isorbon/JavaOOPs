package com.syntax.class12;

import java.util.Scanner;

public class HomeWork06_Object {

	public static void main(String[] args) {
		// Object of Class HomeWork07
		
		HomeWork06 studentGrade = new HomeWork06();
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter your score: ");
		int gr = inp.nextInt();
		
		System.out.print("Your Grade is ");
		studentGrade.getGrade(gr);
		
	}

}

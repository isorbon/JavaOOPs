package com.syntax.class13;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		/*
		 * Accept username, password and confirm password from a user and check
		 * following requirements: 
		 * 1. Username and Password cannot be empty, if so→ message=”Username and Password cannot be empty”. 
		 * 2. Password should be minimum 8 characters, if less → message=”Password is too short”. 
		 * 3.Password cannot contain username if so, → message=”Password cannot contain username”.
		 * 4.Password should match confirmed password, if not → message=“Passwords do not
		 * match”. Only after all requirements met → message “Your username and password
		 * has been created”
		 */
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter your username: ");
		String userName = inp.nextLine();
		System.out.print("Enter your Password: ");
		String passWord = inp.nextLine();
		System.out.print("Confirm your Password: ");
		String confPass = inp.nextLine();
		
		
		if(!(userName.isEmpty() || passWord.isEmpty())) {
			if(passWord.length() >= 8) {
				if(!passWord.contains(userName)) {
					
					if(passWord.equals(confPass)) {
						System.out.println("Your username and password has been created");
					}else {
						System.out.println("Passwords do not match");
					}
					
				}else {
					System.out.println("Password cannot contain username");
				}
			}else {
				System.out.println("Password is too short");
			}
		}else {
			System.out.println("Username and Password cannot be empty");	
		}
		
	}

}

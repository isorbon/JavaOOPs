package com.syntax.class12;

public class HomeWork04 {
	/*
	 * Create a method createEmail(). Based on values of users name, lastName and
	 * email type, your method should return complete email Address. Example:
	 * createEmail(John, Snow, gmail) → johnsnow@gmail.com
	 */
	
	String createEmail(String userName, String lastName, String email) {
		return "johnsnow@gmail.com";
	}
	
	public static void main(String[] args) {
		//Created Object of HomeWork04 class
		
		HomeWork04 eMail = new HomeWork04();
		String emailAddress = eMail.createEmail("John", "Snow", "gmail");
		System.out.println(emailAddress);
	}
}

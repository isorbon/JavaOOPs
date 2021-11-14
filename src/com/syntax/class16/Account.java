package com.syntax.class16;

public class Account {

	private String userName;
	private String password;
	private String name;
	private String address;
	private int age;
	private double accountBalance = 10;

	public void setUserName(String accountuserName) {
		if (accountuserName.length() < 16) {
			userName = accountuserName;
		} else {
			System.out.println("UserName of this length is not allowed");
		}
	}

	public void setPassword(String accountPass) {
		if (accountPass.length() < 16) {
			password = accountPass;
		} else {
			System.out.println("Password of this length is not allowed");
		}
	}

	public void getBalance(String accountuserName, String accountPassword) {
		if (userName.equals(accountuserName) && password.equals(accountPassword)) {
			System.out.println(accountBalance);
		} else {
			System.out.println("UserName or password is not correct");
		}
	}
}

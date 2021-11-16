package com.syntax.class17;

public class Task3 {
	/*
	 * Write a java class that have 4 constructors with 4 different access levels of
	 * constructors(private,public,default,protected) and create 4 objects of this
	 * class: 1 - inside same class; 2 - from outside the class; 3 - from different
	 * class inside different package and observe result.
	 */

	private Task3(String pass) {
		System.out.println("private constructor");
	}
	public Task3(String username) {
		System.out.println("public constructor");
	}
	Task3(int age) {
		System.out.println("default constructor");
	}
	protected Task3(String place) {
		System.out.println("protected constructor");
	}


	public static void main(String[] args) {
		private new Task3("123password");
		public new Task3("username");
		new Task3(28);
	}
}

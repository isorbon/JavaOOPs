package com.syntax.class17;

public class Task3 {
	/*
	 * Write a java class that have 4 constructors with 4 different access levels of
	 * constructors(private,public,default,protected) and create 4 objects of this
	 * class: 1 - inside same class; 2 - from outside the class; 3 - from different
	 * class inside different package and observe result.
	 */
	
	String name;
	String model;
	int year;
	int memory;
	
	public Task3() {
		
	}
	public Task3(String name) {
		this.name = name;
	}

	private Task3(String name, String model, int year, int memory) {
		super();
		this.name = name;
		this.model = model;
		this.year = year;
		this.memory = memory;
	}
		
	
}

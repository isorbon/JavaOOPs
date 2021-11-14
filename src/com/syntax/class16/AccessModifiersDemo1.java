package com.syntax.class16;

public class AccessModifiersDemo1 {
	
	private String name;
	int age;
	public double salary;
	
	private void displayName() {
		System.out.println(name);
	}
	
	void displayAge() {
		System.err.println(age);
	}
	
	public void displaySalary() {
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
	   AccessModifiersDemo1 am = new AccessModifiersDemo1();
	   am.name = "Nabil";
	   am.age = 22;
	   am.salary = 12566;
	   am.displayName();
	   am.displayAge();
	   am.displaySalary();
	}
}

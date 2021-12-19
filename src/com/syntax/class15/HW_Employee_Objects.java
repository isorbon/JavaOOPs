package com.syntax.class15;

public class HW_Employee_Objects {

	public static void main(String[] args) {
		// Two Objects of the HW_Employee class 
		
		HW_Employee emp1 = new HW_Employee();
		emp1.eID = 405713;
		emp1.salary = 2571;
		System.out.println("ID: " + emp1.eID);
		System.out.println("Salary: " + emp1.salary);
		System.out.println("CEO: " + HW_Employee.ceo);
		
		System.out.println();
		
		HW_Employee emp2 = new HW_Employee();
		emp2.eID = 406713;
		emp2.salary = 3289;
		System.out.println("ID: " + emp2.eID);
		System.out.println("Salary: " + emp2.salary);
		System.out.println("CEO: " + HW_Employee.ceo);
	}

}

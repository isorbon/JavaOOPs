package com.syntax.class15;

public class HW_Students_Objects {

	public static void main(String[] args) {
		// Three object of the HW_Students class

		HW_Students stud1 = new HW_Students();
		stud1.studentName = "Aysha";
		stud1.studentID = 98243;
		HW_Students.numberOfStudents ++;
		
		HW_Students stud2 = new HW_Students();
		stud2.studentName = "Aysha";
		stud2.studentID = 98243;
		HW_Students.numberOfStudents ++;
		
		HW_Students stud3 = new HW_Students();
		stud3.studentName = "Aysha";
		stud3.studentID = 98243;
		HW_Students.numberOfStudents ++;
		
		System.out.println("The total number of students: " + HW_Students.numberOfStudents);
	
	}

}

package com.syntax.class21.homework;

public class StudentPolymorphism {
    public static void main(String[] args) {

        Student[] students = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for (Student student:students
             ) {
            student.knowledge();
            student.study();
        }

        Student student = new SyntaxStudent();
        SyntaxStudent syntaxStudent = (SyntaxStudent) student;
        syntaxStudent.term();
        syntaxStudent.tester();

        Student student1 = new CollegeStudent();
        CollegeStudent collegeStudent = (CollegeStudent) student1;
        collegeStudent.age();

        Student student2 = new SchoolStudent();
        SchoolStudent schoolStudent = (SchoolStudent) student2;
        schoolStudent.subject();
    }
}

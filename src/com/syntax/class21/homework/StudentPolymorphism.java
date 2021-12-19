package com.syntax.class21.homework;

public class StudentPolymorphism {
    public static void main(String[] args) {

        Student[] students = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for (Student student:students
             ) {
            student.knowledge();
            student.study();

            if(student instanceof SyntaxStudent){
                ((SyntaxStudent)student).term();
                ((SyntaxStudent)student).tester();
            }
            if(student instanceof CollegeStudent){
                ((CollegeStudent)student).age();
            }
            if(student instanceof SchoolStudent){
                ((SchoolStudent)student).subject();
            }
        }

    }
}

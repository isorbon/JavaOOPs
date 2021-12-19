package com.syntax.class21.homework;

public class Student {
   /* Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override some of the methods in child classes
    Define some methods specific to child classes
    Write example of achieving run time polymorphism*/

    void knowledge(){
        System.out.println("I want to take knowledge");
    }
    void study(){
        System.out.println("Training is conducted offline");
    }

}
class SyntaxStudent extends Student{
    @Override
    void knowledge() {
        System.out.println("The Syntax Student wants to take knowledge");
    }
    @Override
    void study() {
        System.out.println("Syntax Training is conducted online");
    }
    void term(){
        System.out.println("a Syntax student is trained in an intensive program");
    }
    void tester(){
        System.out.println("a Syntax student is trained to be a Software Tester");
    }
}
class CollegeStudent extends Student{
    @Override
    void knowledge() {
        System.out.println("The College Student wants to take knowledge");
    }

    @Override
    void study() {
        System.out.println("Training is conducted at College");
    }

    void age(){
        System.out.println("a College student is mostly a young man");
    }
}
class SchoolStudent extends Student{
    @Override
    void knowledge() {
        System.out.println("The School Students want to take knowledge");
    }

    @Override
    void study() {
        System.out.println("Training is conducted at School");
    }

    void subject(){
        System.out.println("a School student learns fundamental things.");
    }

}

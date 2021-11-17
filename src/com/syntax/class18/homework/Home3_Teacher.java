package com.syntax.class18.homework;

public class Home3_Teacher {
    /*
    Write a Java program called Teacher. Identify features and behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own
    features and behaviour. Test all 4 classes
    */
    String name;
    protected String subject;
    int experienceYear;
    int age;

    void teaching(){
        System.out.println(name + " teaches " + subject + " at school");
    }
    void educate(){
        System.out.println(name + " educates the students");
    }
    void experience(){
        System.out.println(name + " has " + experienceYear + " years experiences");
    }

}

package com.syntax.class18.homework;

public class Home3_Teacher_Print {
    public static void main(String[] args) {
        Home3_MathTeacher obj = new Home3_MathTeacher();
        obj.name = "John";
        obj.age = 33;
        obj.experienceYear = 15;
        obj.subject = "Math";
        obj.teaching();
        obj.experience();
        obj.goodMath();
        obj.masterMath();
        System.out.println("-------------------------");
        Home3_ChemistryTeacher obj2 = new Home3_ChemistryTeacher();
        obj2.name = "Emma";
        obj2.age = 25;
        obj2.experienceYear = 6;
        obj2.subject = "Chemistry";
        obj2.teaching();
        obj2.experience();
        obj2.works();
        obj2.educate();
        System.out.println("-------------------------");
        Home3_PianoTeacher obj3 = new Home3_PianoTeacher();
        obj3.name = "Ann";
        obj3.experienceYear = 23;
        obj3.subject = "Piano";
        obj3.teaching();
        obj3.playPiano();
        obj3.experience();
        obj3.playGuitar();
    }
}

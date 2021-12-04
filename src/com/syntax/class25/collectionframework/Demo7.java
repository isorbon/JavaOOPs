package com.syntax.class25.collectionframework;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {

        ArrayList<String> subjects1 = new ArrayList<>();

        subjects1.add("SDLC");
        subjects1.add("Manual Testing");
        subjects1.add("Java");
        subjects1.add("Git");
        subjects1.add("Selenium");

        ArrayList<String> subjects2 = new ArrayList<>();

        subjects2.add("TestNG");
        subjects2.add("Cucumber");
        subjects2.add("SQL");
        subjects2.add("API");
        subjects2.add("Docker");
        subjects2.add("AWS");
        subjects2.add("Mobile Testing");
        subjects2.add("Mock Interview");

        ArrayList<String> subjects = new ArrayList<>();
        subjects.addAll(subjects1);
        subjects.addAll(2, subjects2);
        subjects1.clear();
        subjects2.clear();
        System.out.println(subjects);
    }
}

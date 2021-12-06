package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> subjects1 = new ArrayList<>();

        subjects1.add("SDLC");
        subjects1.add("Manual Testing");
        subjects1.add("Java");
        subjects1.add("Git");
        subjects1.add("Selenium");
        subjects1.add("TestNG");
        subjects1.add("Cucumber");
        subjects1.add("SQL");
        subjects1.add("API");

        ArrayList<String> subjects2 = new ArrayList<>();

        subjects2.add("TestNG");
        subjects2.add("Cucumber");
        subjects2.add("SQL");
        subjects2.add("API");
        subjects2.add("Docker");
        subjects2.add("AWS");
        subjects2.add("Mobile Testing");
        subjects2.add("Mock Interview");
        subjects1.retainAll(subjects2);  // retain keeps all common elements and remove others
        System.out.println(subjects1);

    }
}

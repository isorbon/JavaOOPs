package com.syntax.class25.collectionframework;

import java.util.ArrayList;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNG");
        subjects.add("Cucumber");
        subjects.add("SQL");
        subjects.add("API");
        subjects.add("Docker");
        subjects.add("AWS");
        subjects.add("Mobile Testing");
        subjects.add("Mock Interview");
        subjects.add("Dead");
        System.out.println(subjects.size());
        subjects.remove("Dead");
        System.out.println(subjects.size());
        System.out.println(subjects.indexOf("SQL"));
        System.out.println(subjects);

    }
}

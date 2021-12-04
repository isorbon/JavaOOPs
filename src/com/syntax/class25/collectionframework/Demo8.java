package com.syntax.class25.collectionframework;

import java.util.ArrayList;

public class Demo8 {
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
        subjects1.add("Docker");
        subjects1.add("AWS");
        subjects1.add("Mobile Testing");
        subjects1.add("Mock Interview");

        ArrayList<String> subjects2 = new ArrayList<>();

        subjects2.add("Docker");
        subjects2.add("AWS");
        subjects2.add("Mobile Testing");
        subjects2.add("Mock Interview");

        System.out.println(subjects1);
        subjects1.removeAll(subjects2); // it compares each coincidence and remove that
        System.out.println(subjects1);

    }
}

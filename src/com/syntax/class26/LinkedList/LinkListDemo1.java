package com.syntax.class26.LinkedList;

import java.util.LinkedList;

public class LinkListDemo1 {
    public static void main(String[] args) {
        LinkedList<String> subjects = new LinkedList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNG");

        System.out.println(subjects);
        subjects.set(2, "Python");
        System.out.println(subjects);

    }
}

package com.syntax.class17;

public class StaticConstructor {
    // Write program that have static constructor and observe result.

    String fName;
    String sName;
    int yearBirth;
    String placeBirth;

    public static StaticConstructor(String fName, String sName, int yearBirth, String placeBirth) {
        this.fName = fName;
        this.sName = sName;
        this.yearBirth = yearBirth;
        this.placeBirth = placeBirth;
    }
}

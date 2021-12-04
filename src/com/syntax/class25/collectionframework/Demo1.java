package com.syntax.class25.collectionframework;

import java.util.ArrayList;

public class Demo1 {

    /*
    * Limitation of arrays
      1) Arrays are fixed in size

    * */
    public static void main(String[] args) {
        String name = "Hasim";
        String name2 = "Ahmet";
        String[] names = {"Mayam", "Amran"};
        // names[2]="Mohammad"; // can't add more than 2 elements

        ArrayList<String> listOfNames = new ArrayList<>();
        System.out.println("Size of listOfNames " + listOfNames.size());
        listOfNames.add("Mustafa");
        listOfNames.add("Aysha");
        listOfNames.add("Tamanna");
        System.out.println("Size of listOfNames " + listOfNames.size());
        listOfNames.remove("Tamanna");
        System.out.println("Size of listOfNames " + listOfNames.size());
    }
}

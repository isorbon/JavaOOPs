package com.syntax.class25;

import java.util.ArrayList;

public class HomeWork {
    /*Create an ArrayList that will store 5 names into it.
    Find out whether the given ArrayList is empty or not?
    Check whether the specific name is present in an ArrayList or not?
    Find the size of your arrayList and print all values from that*/

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Aysha");
        names.add("Silva");
        names.add("Alexey");
        names.add("Demir");
        names.add("Zema");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Hasim"));
        System.out.println(names.size());
        System.out.println(names);
    }
}

package com.syntax.class26.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListWords {
    // Create an arrayList of words. Remove every word that ends with “e”.
    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<>();
        word.add("Home");
        word.add("Syntax");
        word.add("Java");
        word.add("Apple");
        word.add("Above");

        // word.removeIf(element -> element.endsWith("e"));
        Iterator<String> iter = word.iterator();
        while(iter.hasNext()){
            String element = iter.next();
            if(element.toLowerCase().endsWith("e")){
                iter.remove();
            }
        }
        System.out.println(word);
    }
}

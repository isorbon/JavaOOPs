package com.syntax.class26.hashSet;

import java.util.HashSet;
import java.util.LinkedList;

public class SetDemo1 {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        // LinkedList prints all elements, but HashSet doesn't print/store duplicates

        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Kiwi");
        hashSet.add("Apple");
        System.out.println(hashSet);
    }
}

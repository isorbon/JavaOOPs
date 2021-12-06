package com.syntax.class26.hashSet;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Z");
        treeSet.add("X");
        treeSet.add("A");

        System.out.println(treeSet);
    }
}

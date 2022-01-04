package com.syntax.class26.hashSet;

import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo4 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("one");
        treeSet.add("two");
        treeSet.add("three");
        treeSet.add("four");
        treeSet.add("one");

        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

       // System.out.println(treeSet);
    }
}

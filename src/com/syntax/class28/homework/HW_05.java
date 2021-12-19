package com.syntax.class28.homework;

import java.util.*;

public class HW_05 {
    /* Create the collection that will store single uniques Objects of a String type in which order is preserved.
     Write a logic to concatenate all string from the collection.*/
    public static void main(String[] args) {

        Set<String> obj = new LinkedHashSet<>();
        obj.add("Apple");
        obj.add("Orange");
        obj.add("Mango");
        obj.add("Lemon");
        obj.add("Coconut");

        StringBuilder values = new StringBuilder();
        for (String objects:obj
             ) {
            values.append(objects);
        }
        System.out.println(values);
    }
}

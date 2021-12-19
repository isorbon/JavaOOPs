package com.syntax.class28.homework;

import java.util.*;

public class HW_6 {
   /* Create a collection of integers in which you can keep duplicates.
    Write a logic to find sum of all integers*/
    public static void main(String[] args) {
        Collection<Integer> object = new ArrayList<>();
        Integer sum = 0;
        object.add(68);
        object.add(45);
        object.add(45);
        object.add(32);
        object.add(42);

        System.out.println(object);

        for (Integer obj:object
             ) {
            sum += obj;
        }
        System.out.println("Sum of all integer: " + sum);


      /*  for (String key: objects.keySet()
        ) {
            System.out.print(key);
        }

        System.out.println();

        for (String value: objects.values()
        ) {
            System.out.print(value);
        } */
    }
}

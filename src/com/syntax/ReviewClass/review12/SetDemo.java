package com.syntax.ReviewClass.review12;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
    public static void main(String[] args) {
        /*
        * HashSet no duplicate no insertion order
        * */
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(20); // Duplicates are not allowed, so this will be ignored
        hashSet.add(30);
        System.out.println(hashSet);

        for (Integer number:hashSet
             ) {
            System.out.println(number); // printing elements one by one
        }

        // hashSet.remove(20);
        System.out.println(hashSet);

       // hashSet.removeIf(number -> number > 10);  // by lambda method

        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            Integer number = iterator.next();
            if (number > 10){
                iterator.remove();
            }
        }

        System.out.println(hashSet);
    }
}

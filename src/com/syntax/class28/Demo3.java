package com.syntax.class28;

import java.util.LinkedHashMap;

public class Demo3 {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> students = new LinkedHashMap<>();
        students.put(10,"Alexey");
        students.put(10,"Denis"); // keys should be unique if we insert the data
                                  // with same key it will replace the old data
        students.put(20,"Denis");
        students.put(100,"Henok");
        System.out.println(students);

    }
}

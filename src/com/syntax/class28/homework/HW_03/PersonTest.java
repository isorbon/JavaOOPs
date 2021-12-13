package com.syntax.class28.homework.HW_03;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PersonTest {
    public static void main(String[] args) {

        TreeMap<Integer, String> object = new TreeMap<>();
        Person obj1 = new Person("Alexey","Sitalo",28,8540.50);
        String value1 = obj1.printUser();
        object.put(654987,value1);

        Person obj2 = new Person("Aysha","Eshonova",25,8320.20);
        String value2 = obj2.printUser();
        object.put(987356,value2);

        Set<Map.Entry<Integer, String>> entrySet = object.entrySet();
        for (Map.Entry<Integer, String> entry:entrySet
             ) {
            System.out.println(entry);
        }

    }
}

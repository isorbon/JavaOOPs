package com.syntax.class28;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo8 {
    public static void main(String[] args) {
        HashMap<String, Double> grocery = new HashMap<>();
        grocery.put("egg", 20.0);
        grocery.put("rice", 13.0);
        grocery.put("milk", 4.3);
        grocery.put("tomato", 4.3);

        System.out.println(grocery);
        Set<Map.Entry<String, Double>> entrySet = grocery.entrySet(); // both keys and values
        for (Map.Entry<String, Double> entry : entrySet
        ) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}

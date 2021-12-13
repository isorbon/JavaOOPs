package com.syntax.class28;

import java.util.HashMap;
import java.util.Iterator;

public class Demo7 {
    public static void main(String[] args) {
        HashMap<String, Double> grocery = new HashMap<>();
        grocery.put("egg", 20.0);
        grocery.put("rice", 13.0);
        grocery.put("milk", 4.3);
        grocery.put("tomato", 4.3);

        System.out.println(grocery);
        Iterator<Double> iter = grocery.values().iterator();//map=> set=> Iterator
        while (iter.hasNext()) {
            Double value = iter.next();
            if (value == 4.3) {
                iter.remove();
            }
        }
        System.out.println(grocery);
    }
}

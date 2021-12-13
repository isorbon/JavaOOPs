package com.syntax.class28;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Demo5 {
    public static void main(String[] args) {
        HashMap<String,Double> grocery = new HashMap<>();
        grocery.put("Soap",20.0);
        grocery.put("Shampoo",13.0);
        grocery.put("Beer",2.0);

        System.out.println(grocery);
        Collection<String> keys = grocery.keySet(); //to get the keys only separately from map
        System.out.println(keys);

        Collection<Double> values = grocery.values(); // to get the values only separately from map
        System.out.println(values);
    }
}

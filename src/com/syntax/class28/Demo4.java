package com.syntax.class28;

import java.util.TreeMap;

public class Demo4 {
    public static void main(String[] args) {

        TreeMap<String,Double> groceriesList1 = new TreeMap<>();
        groceriesList1.put("Eggs",3.99);
        groceriesList1.put("Tomato",3.2);
       // groceriesList1.put("Potato",10); // Auto Conversion does not work im wrapper classes
        groceriesList1.put("Potato",10.0);
        groceriesList1.put("Milk", 5.0);
        groceriesList1.put("Steak", 15.0);

        TreeMap<String,Double> groceriesList2 = new TreeMap<>();
        groceriesList2.put("Soap",20.0);
        groceriesList2.put("Shampoo",13.0);
        groceriesList2.put("Beer",2.0);

        TreeMap<String,Double> groceriesList = new TreeMap<>();
        groceriesList.putAll(groceriesList1);
        groceriesList.putAll(groceriesList2);

        System.out.println(groceriesList);

        //or we can do like this:
      /*  TreeMap<String,Double> groceriesList2 = new TreeMap<>(groceriesList1);
        groceriesList2.put("Soap",20.0);
        groceriesList2.put("Shampoo",13.0);
        groceriesList2.put("Beer",2.0);
        System.out.println(groceriesList2); */
    }
}

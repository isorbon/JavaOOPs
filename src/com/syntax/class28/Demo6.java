package com.syntax.class28;

import java.util.HashMap;
import java.util.Iterator;

public class Demo6 {
    public static void main(String[] args) {
        HashMap<String,Double> grocery = new HashMap<>();
        grocery.put("egg",20.0);
        grocery.put("rice",13.0);
        grocery.put("milk",2.0);
        grocery.put("tomato",2.0);

        System.out.println(grocery);
        Iterator<String> iter = grocery.keySet().iterator();//from map gets the set and from the set we can do Iterator
        while (iter.hasNext()){
            String key = iter.next();
            if(key.contains("e")){
                iter.remove();
            }
        }
        System.out.println(grocery);
    }
}

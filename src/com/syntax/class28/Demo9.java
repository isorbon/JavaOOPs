package com.syntax.class28;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Demo9 {
    public static void main(String[] args) {
        HashMap<String, Double> grocery = new HashMap<>();
        grocery.put("egg", 20.0);
        grocery.put("rice", 13.0);
        grocery.put("milk", 4.3);
        grocery.put("tomato", 4.3);

        System.out.println(grocery);
        Iterator<Map.Entry<String, Double>> iter = grocery.entrySet().iterator(); // both keys and values
        while (iter.hasNext()){
            Map.Entry<String, Double> entry = iter.next();
            if(entry.getKey().equals("milk") && entry.getValue()==4.3){
                iter.remove();
            }
        }
        System.out.println(grocery);

    }
}

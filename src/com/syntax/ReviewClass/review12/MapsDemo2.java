package com.syntax.ReviewClass.review12;

import java.util.LinkedHashMap;
import static com.syntax.utils.MapUtils.sortByValue;

public class MapsDemo2 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>(); //Thread safe
        linkedHashMap.put("Hasim",22);
        linkedHashMap.put("Demir",25);
        linkedHashMap.put("Alona",16);
        linkedHashMap.put("Marina",16);
        System.out.println(linkedHashMap);

        linkedHashMap = sortByValue(linkedHashMap);
        System.out.println(linkedHashMap);
    }
}

package com.syntax.class26.homework;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
   // How can you remove all duplicates from ArrayList?
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        System.out.println(aList);

        Set<String> set = new LinkedHashSet<>(aList);
        System.out.println(set);

    }
}

package com.syntax.class25.collectionframework;

import javax.swing.*;
import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        System.out.println(numbers);

        ArrayList<Boolean> booleans = new ArrayList<>();
        booleans.add(true);
        booleans.add(false);
        booleans.add(true);
        System.out.println(booleans);

        /*ArrayList arrayList = new ArrayList();
        arrayList.add("Simon");
        arrayList.add(10);
        arrayList.add(false);
// not a good practice
        for (Object arr:arrayList
             ) {
            System.out.println(((Spring)arr).length());
        }*/
    }
}

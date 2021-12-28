package com.syntax.ReviewClass.review12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class SetDemo5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 30, 40, 40);

     /*   List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(10);
        numbers2.add(20);
        numbers2.add(30);
        numbers2.add(30);   // same as numbers
        numbers2.add(40);
        numbers2.add(40); */

        numbers = new ArrayList<>(new LinkedHashSet<>(numbers));
        System.out.println(numbers);

    }
}

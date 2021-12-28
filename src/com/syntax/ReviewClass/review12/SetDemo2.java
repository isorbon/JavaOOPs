package com.syntax.ReviewClass.review12;

import java.util.Collections;
import java.util.HashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(20); // Duplicates are not allowed, so this will be ignored
        hashSet.add(30);

        hashSet.removeIf(x -> x > 10);
        System.out.println(hashSet);
    }
}

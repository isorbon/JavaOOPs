package com.syntax.utils;

import java.util.ArrayList;

public class ArraysUtil {
    public static ArrayList<Integer> convertToArrayList(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>(arr.length);
        for (int a : arr  // converting an array to ArrayList
        ) {
            arrayList.add(a);
        }
        return arrayList;
    }
}

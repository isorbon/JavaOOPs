package com.syntax.ReviewClass.review11;

import com.syntax.utils.ArraysUtil;

import java.util.ArrayList;

public class ListDemo3 {
    public static void main(String[] args) {
        int[] arr = {10,5,3,4,25};

        ArrayList<Integer> arrayList = ArraysUtil.convertToArrayList(arr);
        System.out.println(arrayList);


    }
}

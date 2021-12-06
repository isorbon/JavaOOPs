package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();
        ArrayList<String> subjects2 = new ArrayList<>();
        ArrayList<String> subjects3 = new ArrayList<>();
        ArrayList<String> subjects4 = new ArrayList<>();
        ArrayList<String> subjects5 = new ArrayList<>();
        ArrayList<ArrayList<String>> arrayListArrayList = new ArrayList<>();
        arrayListArrayList.add(subjects);
        arrayListArrayList.add(subjects2);
        arrayListArrayList.add(subjects3);
        arrayListArrayList.add(subjects4);
        arrayListArrayList.add(subjects5);

        System.out.println(arrayListArrayList);
    }
}

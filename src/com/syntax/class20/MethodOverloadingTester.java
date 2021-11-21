package com.syntax.class20;

public class MethodOverloadingTester {
    public static void main(String[] args) {
        MethodOverloading.add(10,10);
        MethodOverloading.addDouble(10.5,10.5);
        MethodOverloading.addIntDouble(10, 10.5);
        MethodOverloading.addInt(10,10,10);
        int[] arr = {10,10};
        MethodOverloading.addArray(arr);
    }
}

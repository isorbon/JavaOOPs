package com.syntax.class20;

public class Task2 {
   /* Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method
    with specific arguments and observe result.*/

    static void sum(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    static void sum(int n1, int n2, int n3) {
        System.out.println(n1 + n2 + n3);
    }
    static void sum(int n1, double n2, float n3) {
        System.out.println(n1 + n2 + n3);
    }
    static void method(Programming prog){
        System.out.println(5);
    }
}

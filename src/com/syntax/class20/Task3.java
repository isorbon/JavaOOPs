package com.syntax.class20;

public class Task3 {
    /*
    * Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method
    * with specific arguments and observe result.*/

    private void method() {
        System.out.println("void method");
    }

    private int method(int num) {
        System.out.println("int method");
        return num;
    }

    private int method(String str) {
        System.out.println("string method");
        return 5;
    }

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.method();
        task3.method(10);
        task3.method("ss");
    }
}


package com.syntax.class18;

public class Animal {
    String name;
   protected String breed; //we can use protected, cause it can be accessible from another package
    String color;
    int age;
    double weight;

    void eat() {
        System.out.println(name + " eating");
    }

    void sleep() {
        System.out.println(name + " Sleeping");
    }
}

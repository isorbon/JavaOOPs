package com.syntax.class18;

public class Dog extends Animal {

    boolean loyal = true;
    void printAllInfo() {
        System.out.println(name + breed + color + age + weight);
        eat();
    }

    void bakr() {
        System.out.println(name + " barking");
    }
}

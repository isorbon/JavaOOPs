package com.syntax.class18;

public class AnimalTester {
    public static void main(String[] args) {
        Dog dog= new Dog();
        dog.name = "Boby";
        dog.bakr();
        dog.eat();

        Cat cat = new Cat();
        cat.name = "Texy";
        cat.meow();


        System.out.println(dog.name);
    }
}

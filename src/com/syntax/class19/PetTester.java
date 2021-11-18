package com.syntax.class19;

public class PetTester {
    public static void main(String[] args) {
        Dog dog = new Dog("Boby", "Bulldog", "Black", 10);
        dog.print();

        Cat cat = new Cat("Murka", "Home", "Black-White", 1);
        cat.printAge();
    }
}

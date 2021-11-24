package com.syntax.class22.homework;

public class Computer {
    /*Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override some of the methods in child classes
    Define some methods specific to child classes
    Create objects of child classes and store them into array. Loop through each object and execute available methods.*/

    String name;
    String oSystem;

    Computer(String name, String oSystem) {
        this.name = name;
        this.oSystem = oSystem;
    }

    void oSystem() {
        System.out.println(name + " works on " + oSystem + " Operating System");
    }
}

class Apple extends Computer {
    Apple(String name, String oSystem) {
        super(name, oSystem);
    }

    @Override
    void oSystem() {
        System.out.println(name + " works in " + oSystem + " OS");
    }

    void specificMethod() {
        System.out.println("Usually " + name + " products work on its software");
    }
}

class Lenovo extends Computer {
    Lenovo(String name, String oSystem) {
        super(name, oSystem);
    }

    @Override
    void oSystem() {
        System.out.println(name + " works on " + oSystem + " OS");
    }

    void specificMethod() {
        System.out.println(name + " tabs works on Android OS");
    }
}

class HP extends Computer {
    HP(String name, String oSystem) {
        super(name, oSystem);
    }

    @Override
    void oSystem() {
        System.out.println(name + " works on " + oSystem + " OS");
    }

    void specificMethod() {
        System.out.println(name + " is able to work on Linux OS too");
    }
}

class Dell extends Computer {
    Dell(String name, String oSystem) {
        super(name, oSystem);
    }

    void specificMethod() {
        System.out.println(name + "'s Servers usually are used in many Data Centers");
    }
}
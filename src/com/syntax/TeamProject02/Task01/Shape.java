package com.syntax.TeamProject02.Task01;
/* Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
    Test your code. */

public interface Shape {
    double Pi = 3.14;

    void calculateArea(double number);
    void calculatePerimeter(double number);
}

class Circle implements Shape {

    @Override
    public void calculateArea(double number) {
        System.out.println("The Circle Area is " + (Pi * (number * number)));
    }

    @Override
    public void calculatePerimeter(double number) {
        System.out.println("The Circle Perimeter is " + (2 * Pi * number));
    }
}

class Square implements Shape {

    @Override
    public void calculateArea(double number) {
        System.out.println("The Square Area is " + (number * number));
    }

    @Override
    public void calculatePerimeter(double number) {
        System.out.println("The Square Perimeter is " + (4 * number));
    }
}


package com.syntax.TeamProject02.Task01;
/* Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
    Test your code. */

public interface Shape {
    void calculateArea(double number);

    void calculatePerimeter(double number);
}

class Circle implements Shape {

    @Override
    public void calculateArea(double number) {
        System.out.println("The Circle Area is " + (change(Math.PI * Math.pow(number, 2),2)));
    }

    @Override
    public void calculatePerimeter(double number) {
        System.out.println("The Circle Perimeter is " + (change(2 * Math.PI * number, 2)));
    }

    static double change(double value, int decimalpoint)
    {
        // Using the pow() method
        value = value * Math.pow(10, decimalpoint);
        value = Math.floor(value);
        value = value / Math.pow(10, decimalpoint);

        return value;
    }
}

class Square implements Shape {

    @Override
    public void calculateArea(double number) {
        System.out.println("The Square Area is " + (change(number * number, 2)));
    }

    @Override
    public void calculatePerimeter(double number) {
        System.out.println("The Square Perimeter is " + (change(4 * number, 2)));
    }

    static double change(double value, int decimalpoint)
    {
        // Using the pow() method
        value = value * Math.pow(10, decimalpoint);
        value = Math.floor(value);
        value = value / Math.pow(10, decimalpoint);

        return value;
    }
}


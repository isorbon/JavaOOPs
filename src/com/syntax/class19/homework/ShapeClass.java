package com.syntax.class19.homework;

public class ShapeClass {
    /*
    Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    In circle class create a method to calculate the area of circle. Test your code
     */
    double radius;
    ShapeClass(double radius) {
        this.radius = radius;
    }
}

class CircleClass extends ShapeClass{
    CircleClass(double radius) {
        super(radius);
    }
    void calculate() {
        double area = Math.PI * super.radius * super.radius;
        System.out.println("The area of circle with radius: " + radius + " is " + area);
    }
}

package com.syntax.class20;

public class Task1 {
    /* Create 1 class in which create a methods that will calculate the area (volume in case of box) of
     - Rectangle
     - Square
     - Box
     Use separate class to test your code*/
    static void areaRectangle(double length, double width) {
        System.out.println(length * width);
    }

    static void areaSquare(double side) {
        System.out.println(side * side);
    }

    static void areaBox(double length, double width, double height) {
        System.out.println(length * width * height);
    }
}

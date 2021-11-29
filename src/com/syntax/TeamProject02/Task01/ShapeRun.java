package com.syntax.TeamProject02.Task01;

public class ShapeRun {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Square()};
        for (Shape shape:shapes
             ) {
            shape.calculateArea(2.3);
            shape.calculatePerimeter(3.1);
        }
    }
}

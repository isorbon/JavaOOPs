package com.syntax.class22.homework;

public class ComputerPoly {
    public static void main(String[] args) {
        Computer[] computers = {new Apple("Apple", "Macintosh"), new Lenovo("Lenovo", "Windows"), new HP("HP",
                "Windows"), new Dell("Dell", "Windows") };

        for (Computer comp:computers
             ) {
            comp.oSystem();

            if (comp instanceof Apple){
                ((Apple)comp).specificMethod();
            }
            if (comp instanceof Lenovo){
                ((Lenovo)comp).specificMethod();
            }
            if (comp instanceof HP){
                ((HP)comp).specificMethod();
            }
            if (comp instanceof Dell){
                ((Dell)comp).specificMethod();
            }
        }
    }
}

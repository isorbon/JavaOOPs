package com.syntax.class17;

public class Task3HW {
    /*
     * Write a java class that have 4 constructors with 4 different access levels of
     * constructors(private,public,default,protected) and create 4 objects of this
     * class: 1 - inside same class; 2 - from outside the class; 3 - from different
     * class inside different package and observe result.
     */

    private Task3HW(){
        System.out.println("private");
    }

    Task3HW(String name){
        System.out.println("default");
    }

    protected Task3HW(int age){
        System.out.println("protected");
    }

    public Task3HW(double weigth){
        System.out.println("public");
    }

    public static void main(String[] args) {
        new Task3HW();
        new Task3HW("name");
        new Task3HW(10);
        new Task3HW(42.2);
    }

}

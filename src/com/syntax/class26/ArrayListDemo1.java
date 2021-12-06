package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList<Fruit> fruit = new ArrayList<>();
        fruit.add(new Apple());
        fruit.add(new Orange());
        for (Fruit f:fruit
             ) {
            f.printName();
        }
    }
}
class Fruit{
    void printName(){
        System.out.println("I am a fruit");
    }
}
 class Apple extends Fruit{
    void printName(){
         System.out.println("I am an apple");
     }
 }

 class Orange extends Fruit{
     void printName(){
         System.out.println("I am an Orange");
     }
 }
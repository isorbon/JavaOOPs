package com.syntax.class26.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCars {
    // Create an arraylist of cars and retrieve all the values using 3 different ways.
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<>();
        car.add("BMW");
        car.add("Toyota");
        car.add("Mercedes");
        car.add("Ford");
        System.out.println(car);
        // 2-nd way
        for (String str : car
        ) {
            System.out.print(str + " ");
        }
        // 3-rd way
        Iterator<String> iterator = car.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }
}

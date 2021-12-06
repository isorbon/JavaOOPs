package com.syntax.class26.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDrinks {
    // Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
    public static void main(String[] args) {
        ArrayList<String> drink = new ArrayList<>();
        drink.add("Beer");
        drink.add("Wine");
        drink.add("Soda");
        drink.add("Lemonade");
        drink.add("Coffee");
        drink.add("Tea");
        drink.add("Juice");
        drink.add("Cider");

        for(int i=0; i < drink.size(); i++){
            if(drink.get(i).contains("a")){
                drink.set(i, drink.get(i).replace("a", "water"));
            }else if (drink.get(i).contains("e")){
                drink.set(i, drink.get(i).replace("e", "water"));
            }
        }
        System.out.println(drink);
    }
}

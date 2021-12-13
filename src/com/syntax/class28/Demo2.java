package com.syntax.class28;

import java.util.HashMap;

public class Demo2 {
    public static void main(String[] args) {

        HashMap<String,Integer> fruit = new HashMap<>();
        fruit.put("Apple",10); // instead of add method we use the put method to
        fruit.put("Mango",15); // insert the data in a map
        fruit.put("Orange",20);
        fruit.put("Kiwi",18);
        fruit.put("Apricot",50);

        System.out.println(fruit.get("Kiwi"));//return the corresponding value to this key
        System.out.println(fruit.remove("Orange"));//removes this key and corresponding value
        System.out.println(fruit); //prints all the data in the map
        System.out.println(fruit.containsKey("cow")); //checks if this key present
        System.out.println(fruit.containsKey("Mango"));
        System.out.println(fruit.containsValue(100)); // checks if this value is present in the map
        System.out.println(fruit.isEmpty()); // checks if the map is empty or not
        System.out.println(fruit.replace("Mango",35)); //replace the value
        System.out.println(fruit);
    }
}

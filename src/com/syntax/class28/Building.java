package com.syntax.class28;

import sun.reflect.generics.tree.Tree;

import java.util.TreeMap;

public class Building {
   /* Create a map of a building. Store floor number and it is associated company name.
    (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
    Check how many entries you have?
    Update company on a 4th floor
    Remove company on the 7th floor
    Print your map*/
    public static void main(String[] args) {

        TreeMap<Integer,String> building = new TreeMap<>();
        building.put(1,"Apple");
        building.put(2,"Syntax");
        building.put(3,"DarAmal");
        building.put(4,"Google");
        building.put(5,"Amazon");
        building.put(6,"Meta");
        building.put(7,"Microsoft");

        System.out.println(building.size());
        building.replace(4,"Microsoft");
        building.remove(7);
        System.out.println(building);

    }
}

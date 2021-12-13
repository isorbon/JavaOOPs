package com.syntax.class28.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HW_02 {
    /* Create a map of Best Buy store. Place item id and item name into it.
     Example (7664847 = Printer, 7879885= TV etc )
     Retrieve all keys and values from a Best Buy map using EntrySet.*/
    public static void main(String[] args) {
        HashMap<Integer, String> bestBuy = new HashMap<>();
        bestBuy.put(653975, "Smartphone");
        bestBuy.put(951789, "SmartWatch");
        bestBuy.put(654753, "NotePad");
        bestBuy.put(954321, "SSD");
        bestBuy.put(987324, "Laptop");
        bestBuy.put(528465, "Printer");

        Set<Map.Entry<Integer, String>> entrySet = bestBuy.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet
        ) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

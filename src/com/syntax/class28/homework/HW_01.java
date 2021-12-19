package com.syntax.class28.homework;

import java.util.*;

public class HW_01 {
  /*  Create a map of countries with its capital that will store countries in alphabetical order.
    Print all keys and values from a country map using for each loop and iterator.
    Print all values from a country map using for each loop and iterator. */
  public static void main(String[] args) {

      TreeMap<String, String> countryCapital = new TreeMap<>();
      countryCapital.put("Ukraine", "Kyiv");
      countryCapital.put("USA", "Washington DC");
      countryCapital.put("Germany", "Berlin");
      countryCapital.put("Mexico", "Mexico City");
      countryCapital.put("Poland", "Warsaw");
      countryCapital.put("Canada", "Ottawa");

      //print all keys and values by EntrySet and for each loop
      Set<Map.Entry<String,String>> entrySet = countryCapital.entrySet();
      for (Map.Entry<String,String> entry : entrySet
           ) {
          System.out.println(entry.getKey() + " - " + entry.getValue());
      }
      System.out.println("-----------------------");
      //print all keys and values by Iterator
      Iterator<Map.Entry<String,String>> iter = countryCapital.entrySet().iterator();
      while (iter.hasNext()){
          Map.Entry<String,String> entry = iter.next();
          System.out.println(entry.getKey() + " - " + entry.getValue());
      }
      System.out.println("-----------------------");

      //print all values by Collection
      Collection<String> values = countryCapital.values();
      System.out.println(values);
  }
}

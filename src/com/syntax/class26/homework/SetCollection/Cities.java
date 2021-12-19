package com.syntax.class26.homework.SetCollection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Cities {
  /*  Create a Set of cities in which you want to make sure that insertion order is maintained.
    Then remove any city that starts with “A”;*/
  public static void main(String[] args) {
      Set<String> city = new TreeSet<>();
      city.add("Kyiv");
      city.add("Ankara");
      city.add("Dushanbe");
      city.add("Washington DC");
      city.add("Angola");
      city.add("Berlin");

      System.out.println(city);

      Iterator<String> iterator = city.iterator();
      while (iterator.hasNext()){
          String element = iterator.next();
          if(element.startsWith("A")){
              iterator.remove();
          }
      }
      System.out.println(city);
  }

}

package com.syntax.class26.homework.SetCollection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Countries {
  /*  Create a Set collection in which you need to add names of the countries.
    In this set we want all objects to be sorted in alphabetical order.
    Using 2 different ways retrieve all elements from set.*/

    public static void main(String[] args) {
        Set<String> country = new TreeSet<>();
        country.add("USA");
        country.add("Ukraine");
        country.add("Tajikistan");
        country.add("Poland");
        country.add("Austria");
        country.add("Spain");
        country.add("Pakistan");
        country.add("Brazil");
        country.add("Moldova");
        country.add("Turkey");

        System.out.println(country);

        Iterator<String> iterator = country.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}

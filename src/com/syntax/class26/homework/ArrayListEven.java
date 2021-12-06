package com.syntax.class26.homework;

import java.util.ArrayList;

public class ArrayListEven {
   /* Create an arrayList of even numbers from 1 to 50.
      Remove any number that is divisible by 5 from that arrayList.*/
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        for (int i=0; i<=50; i++){
           if(i % 2 == 0){
               if (i % 5 != 0) {
                   number.add(i);
               }
           }
        }System.out.println(number);

    }
}

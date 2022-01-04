package com.syntax.class31.homework;

public class HW_02_01 {
   /* Create a method checkUserName that will throw a runtime exception.
    Method should throw an exception when entered username is less than 5 characters.*/
   public static void main(String[] args) {
       try {
           checkUserName("isor");
       } catch (Exception e) {
           e.printStackTrace();
       }
   }

    public static void checkUserName(String username) {
        if (username.length() < 5){
            throw new RuntimeException("The Username should not be less than 5 characters");
        }else {
            System.out.println("Your username is correct");
        }
    }
}



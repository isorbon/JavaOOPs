package com.syntax.class31.homework;

public class HW_01_01 {
   /* Create a method to check age eligibility that will throw a runtime exception.
    Method should throw an exception age is less than 16.*/
    public static void main(String[] args) {
        try {
            ageEligibility(15);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }

    public static void ageEligibility(int age){
        if (age < 16){
            throw new ArithmeticException("The age should be more than 16");
        }else{
            System.out.println("Your age is accept");
        }
    }

}

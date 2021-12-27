package com.syntax.class31.homework;

public class HW_01_02 {
    /* With your own Exception create a method to check age eligibility that will throw a runtime exception.
    Method should throw an exception age is less than 16.*/
    public static void main(String[] args) {
        try {
            Age.ageEligibility(15);
        } catch (AgeEligibilityException e) {
            e.printStackTrace();
        }
    }
}

class AgeEligibilityException extends Exception{
    AgeEligibilityException(String message){
        super(message);
    }
}

class Age{
    public static void ageEligibility(int age) throws AgeEligibilityException{
        if (age < 16){
            throw new AgeEligibilityException("The age should be more than 16");
        }else {
            System.out.println("Your age is accept");
        }
    }
}

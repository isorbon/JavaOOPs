package com.syntax.ReviewClass.review13;

public class Demo3 {
    public static void main(String[] args) {
        checkAge(4);
    }
    public static void checkAge(int age) throws RuntimeException{
        if (age<5){
            throw new RuntimeException("Age to play");
        }else {
            System.out.println("Go to school");
        }
    }
}

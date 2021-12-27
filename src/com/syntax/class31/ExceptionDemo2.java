package com.syntax.class31;

import java.io.FileInputStream;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        try {
            System.out.println("inside try");
            Thread.sleep(1000); //checked exception
            FileInputStream fileInputStream = new FileInputStream("kdsafbsjh");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        int number = 10;
        int number2 = 0;
        if (number2 != 0) {
            System.out.println(number / number2); // unchecked exception

        } else {
            System.out.println("Can't divide by zero");
        }
        String name = null;
        if (name != null) {
            System.out.println(name.length());
        } else {
            System.out.println("Name variable is null");
        }

    }
}

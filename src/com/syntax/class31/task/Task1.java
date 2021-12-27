package com.syntax.class31.task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
  /*  How would handle InputMismatchException? Input Mismatch Exception when user
    enters mismatch value then programmer expected.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Please enter a number");
            int number = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Only number are allowed");
        }
    }
}

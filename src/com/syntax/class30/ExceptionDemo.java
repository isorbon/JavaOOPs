package com.syntax.class30;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Important lines of code");
        System.out.println("Important lines of code");
        try {
            int number=10;
            int number2=0;
            if(number2!=0){
                System.out.println(number/number2);
            }else {
                System.out.println("Not possible");
            }

        }catch (Exception e){
            System.out.println("Dividing by zero not possible in java");
        }

        System.out.println("Important lines of code");
        System.out.println("Important lines of code");
        System.out.println("Important lines of code");
        System.out.println("Important lines of code");
        System.out.println("Important lines of code");
        System.out.println("Important lines of code");

    }
}

package com.syntax.class31;

public class ExceptionDemo7 {
    public static void main(String[] args) {
        try{
            System.out.println("1");
            System.out.println(10/0);
            System.out.println("2");
        }catch (Exception e){
            System.out.println("3");
        }
        finally {
            System.out.println("4");
        }
    }
}

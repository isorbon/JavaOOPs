package com.syntax.ReviewClass.review13;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            System.out.println(10/0);
            System.out.println("2");
        }catch (NullPointerException npe){
            System.out.println("3");
        }
        catch (ArithmeticException ae){
            System.out.println("4");
        }finally {
            System.out.println("5");
        }
        System.out.println("6");
    }
}

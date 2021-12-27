package com.syntax.class31;

import java.io.FileInputStream;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        System.out.println("line 1");
        try{
            System.out.println("line 2");
          //  System.out.println(10/0);

            System.out.println("line 3");
            try{
                int[] arr = new int[-5];
            }catch (Exception er){
                System.out.println("line 13");
            }

            System.out.println("line 4");
            String name = null;

            System.out.println("line 5");
            name.toLowerCase();

            System.out.println("line 6");
            FileInputStream fileInputStream = new FileInputStream("cakshcjas");
        }catch (ArithmeticException e){
            System.out.println("line 7");
            // e.printStackTrace();
        }catch (NegativeArraySizeException e){
            try{
                System.out.println(10/0);
            }catch (ArithmeticException er){
                System.out.println("line 12");
            }
            System.out.println("line 8");
           // e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("line 9");
           //  e.printStackTrace();
        }catch (Exception e){
            System.out.println("line 10");
           //  e.printStackTrace();
        }
        System.out.println("line 11");
    }
}

package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo10 {
    public static void main(String[] args) {
        try{
            readFile();
        }catch (FileNotFoundException e){
            System.out.println("I know better how to handle this");
        }
    }
    public static void readFile() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("sdvsd");
    }
}

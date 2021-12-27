package com.syntax.class31;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo4 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "Files/NewFile.properties";
        File file = new File(path);
        try {
            System.out.println("Yes file exists i will not be getting any errors");
            FileInputStream fileInputStream = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            System.out.println("File is not present at that location");
        }

        System.out.println("Last line");
    }
}

package com.syntax.class31;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo3 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "Files/NewFile.properties";
        File file = new File(path);
        if (file.exists()){
            System.out.println("Yes, file exists I will not be getting any errors");
            FileInputStream fileInputStream = new FileInputStream(path);
        }else{
            System.out.println("File is not present at this path");
        }

        System.out.println("Last line");

    }
}

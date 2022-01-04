package com.syntax.ReviewClass.review13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo1 {
    public static void main(String[] args) {
        String path = "sdfsdf";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            System.out.println("Please check the path of the file");
            // e.printStackTrace();
        }

    }
}

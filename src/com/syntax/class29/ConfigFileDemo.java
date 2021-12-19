package com.syntax.class29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileDemo {
    public static void main(String[] args) throws IOException {

        //location of the file in our project
        String path = "Files/Config.properties";
        // creating a connection to that file or simply navigating to that file
        FileInputStream fileInputStream = new FileInputStream(path);
        // that special program that will help use read the data
        Properties properties = new Properties();
        // loading the data inside properties object from the file
        properties.load(fileInputStream);

        // getting the values for corresponding keys
        System.out.println(properties.get("userName"));
        System.out.println(properties.get("password"));

        fileInputStream.close();

    }
}

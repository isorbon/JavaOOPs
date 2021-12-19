package com.syntax.class29;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileDemo3 {
    public static void main(String[] args) throws IOException {
        //location of the file in our project
        String path = "Files/NewFile.properties";
        Properties properties = new Properties();
        properties.put("UserName", "Asghar123");
        properties.put("Password", "pass123");

        // Creating a connection to the folder
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        // Storing
        properties.store(fileOutputStream,"Creating a new file");

        fileOutputStream.close();
    }
}

package com.syntax.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static String read(String path, String key) throws IOException {
        FileInputStream fileInputStream = null;
        Properties properties = null;
        try {
            //opening that file
            fileInputStream = new FileInputStream(path);
            //creating the object of Properties class
            properties = new Properties();
            //loading all the properties from that file inside the properties object
            properties.load(fileInputStream);
            //getting the value for a specific key and returning it
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        }
        return properties != null ? properties.getProperty(key) : null;
        // getting the value for a specific key and returning it

    }

    public static String read(String key) throws IOException {
        return read("Files/Config.properties", key);

    }

}

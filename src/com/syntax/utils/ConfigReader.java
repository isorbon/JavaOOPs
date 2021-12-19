package com.syntax.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static String read(String path, String key) throws IOException {

        // opening that file
        FileInputStream fileInputStream = new FileInputStream(path);
        // creating the object of Properties class
        Properties properties = new Properties();
        // loading all the properties from that file inside the properties object
        properties.load(fileInputStream);
        // getting the value for a specific key and returning it
        return properties.getProperty(key);

    }

    public static String read(String key) throws IOException {
        return read("Files/Config.properties", key);

    }

}

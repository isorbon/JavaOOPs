package com.syntax.class29;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Task {
   /* Create a property file to store following configurations:
    - browser=chrome
    - url=https://facebook.com
    - username
    - password
    Read file and extract values of browser & url*/
   public static void main(String[] args) throws IOException  {
       String path = "Files/Task.properties";
       Properties properties = new Properties();
       properties.put("browser", "chrome");
       properties.put("url", "https://facebook.com");
       properties.put("username", "sorbon");
       properties.put("password", "123pass654");

       FileOutputStream fileOutputStream = new FileOutputStream(path);
       properties.store(fileOutputStream,"Creating Facebook data");

       System.out.println(properties.get("browser"));
       System.out.println(properties.get("url"));

       fileOutputStream.close();
   }
}

package com.syntax.class23.task;

public class FileTester {
    public static void main(String[] args) {
        File[] files = {new JavaFile(), new WordFile(), new PdfFile()};

        for (File file:files
             ) {
            file.edit();
            file.close();
            file.open();
        }
    }
}

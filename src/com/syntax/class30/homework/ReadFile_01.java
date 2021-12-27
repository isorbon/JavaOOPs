package com.syntax.class30.homework;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile_01 {
    public static void main(String[] args) throws IOException {
        String path = "F:\\SDET\\JAVA\\Class 30\\NewFile.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");

        Row row = sheet.getRow(3);
        Cell cell = row.getCell(3);
        System.out.println(cell);  // output 'Lahore'

        fileInputStream.close();

    }
}

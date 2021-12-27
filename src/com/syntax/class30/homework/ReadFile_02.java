package com.syntax.class30.homework;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile_02 {
    public static void main(String[] args) throws IOException {
        String path = "F:\\SDET\\JAVA\\Class 30\\NewFile.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet1 = xssfWorkbook.getSheet("Sheet1");

        int noOfRow = sheet1.getPhysicalNumberOfRows();
        for (int i = 0; i < noOfRow; i++) {
            Row row = sheet1.getRow(i);

            int noOfCell = row.getPhysicalNumberOfCells();
            for (int j = 0; j < noOfCell; j++) {
                System.out.print(row.getCell(j) + " ");
            }
            System.out.println();
        }

        fileInputStream.close();
    }
}

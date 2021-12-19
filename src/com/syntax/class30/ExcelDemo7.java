package com.syntax.class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo7 {
    public static void main(String[] args) throws IOException {
        // Path where we want to create the file
        String path = "F:\\TESTER\\JAVA\\Class 30\\CreatedFolder\\CreatedFile.xlsx";
        // creating the object of XSSFWorkbook
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        // creating new sheet inside the file with name Sheet123
        Sheet sheet = xssfWorkbook.createSheet("Sheet123");
        // creating the row inside the sheet
        Row row = sheet.createRow(0);
        // creating the cells inside the row 0
        Cell cell = row.createCell(0);
        // setting the data to that newly created cell
        cell.setCellValue("Test");

        // creating the oupputstream
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        // storing the data to that Excel file
        xssfWorkbook.write(fileOutputStream);

        fileOutputStream.close();
    }
}

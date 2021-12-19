package com.syntax.class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo1 {
    public static void main(String[] args) throws IOException {
        String path = "Files/NewData.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path); // reading file
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream); // loading file

        Sheet sheet = xssfWorkbook.getSheet("Sheet1"); // the name of Sheet on Excel file
        Row row = sheet.getRow(4); // position of row
        Cell cell = row.getCell(1); // position of column/cell
        System.out.println(cell);

        fileInputStream.close();
    }
}

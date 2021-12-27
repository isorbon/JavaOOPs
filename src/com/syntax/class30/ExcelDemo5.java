package com.syntax.class30;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelDemo5 {
    public static void main(String[] args) throws IOException {
        String path = "F:\\SDET\\JAVA\\Class 30\\NewFile.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);

        XSSFSheet sheet1 = xssfWorkbook.getSheet("Sheet1");
        int noOfRows = sheet1.getPhysicalNumberOfRows(); // the number of rows that are not empty
        List<Map<String, String>> excelData = new ArrayList<>();
        System.out.println(noOfRows);
        Row row0 = sheet1.getRow(0);

        // we are getting all dynamic
        for (int i = 1; i < noOfRows; i++) {
            XSSFRow row = sheet1.getRow(i);
            LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();
            int noCells = row.getPhysicalNumberOfCells();

            for (int j = 0; j < noCells; j++) {
                hashMap.put(row0.getCell(j).toString(), row.getCell(j).toString());
            }

            excelData.add(hashMap);
        }
        System.out.println(excelData);

        fileInputStream.close();
    }
}

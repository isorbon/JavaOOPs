package com.syntax.class30.homework;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadFile_03 {
    public static void main(String[] args) throws IOException {
        String path = "F:\\SDET\\JAVA\\Class 30\\NewFile.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        List<Map<String, String>> excelData = new ArrayList<>();
        int noOfRow = sheet.getPhysicalNumberOfRows();

        for (int i = 1; i < noOfRow; i++) {
            Row row = sheet.getRow(i);
            LinkedHashMap<String,String> hashMap = new LinkedHashMap<>();
            hashMap.put("fName",row.getCell(0).toString());
            hashMap.put("lName",row.getCell(1).toString());
            hashMap.put("Age",row.getCell(2).toString());
            hashMap.put("City",row.getCell(3).toString());

            excelData.add(hashMap);
        }
        System.out.println(excelData);

        fileInputStream.close();
    }
}

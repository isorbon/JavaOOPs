package com.syntax.class30.homework;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadFile_04 {
    public static void main(String[] args) throws IOException {
        String path = "F:\\SDET\\JAVA\\Class 30\\NewFile.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet1 = xssfWorkbook.getSheet("Sheet1");
        int noOfRow = sheet1.getPhysicalNumberOfRows();

        List<Map<String, String >> excelData = new ArrayList<>();
        Row row0 = sheet1.getRow(0);

        for (int i = 0; i < noOfRow; i++) {
            Row row = sheet1.getRow(i);

            LinkedHashMap<String,String> hashMap = new LinkedHashMap<>();

        }



    }
}

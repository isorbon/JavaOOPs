package com.syntax.class30.homework;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Task01 {
    /* Create an Excel file to store following configurations:
    - browser=chrome
    - url=https://facebook.com
    - username
    - password
    Read file and extract values of browser & url */
    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);
        int data = inp.nextInt();
        String path = "F:\\SDET\\JAVA\\Class 30\\CreatedFolder\\TaskFile.xlsx";
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        XSSFSheet sheet = xssfWorkbook.createSheet("TestSheet");

        List<Map<String, String>> testData = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Row row = sheet.createRow(data);
            LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();

            hashMap.put("First", row.createCell(0).toString());
            hashMap.put("Second", row.createCell(1).toString());
            hashMap.put("Third", row.createCell(2).toString());
            hashMap.put("Fourth", row.createCell(3).toString());

            testData.add(hashMap);
        }

        System.out.println(testData);

       /* Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("TestFile");*/

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);

        fileOutputStream.close();

      /*  FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook1 = new XSSFWorkbook(fileInputStream);
        Sheet sheet1 = xssfWorkbook1.getSheet("TestSheet");
        int nuOfRow = sheet1.getPhysicalNumberOfRows();
        System.out.println(nuOfRow);*/


    }
}

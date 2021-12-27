package com.syntax.utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {
    public static List<Map<String, String>> read(String path) throws IOException {
        return read(path, "Sheet1");
    }

    public static List<Map<String, String>> read() throws IOException {
        return read("Files/ExcelData.xlsx", "Sheet1");
    }

    public static List<Map<String, String>> read(String path, String sheetName) {
        //Reading the raw data from path parameter
        FileInputStream fileInputStream = null;
        List<Map<String, String>> excelData = new ArrayList<>();
        try {
            fileInputStream = new FileInputStream(path);
            //using XSSFWorkbook class to convert that data to Excel format
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
            //Getting the sheet from Excel file
            XSSFSheet sheet1 = xssfWorkbook.getSheet(sheetName);
            //getting the number of rows that actually contains the data
            int noOfRows = sheet1.getPhysicalNumberOfRows();
            //Creating a list of maps to store the data from Excel file inside java program

            //Getting row zero to get the header so that we can use it as keys in map
            Row row0 = sheet1.getRow(0);
            //Loop to get all the rows starting from row 1 one by one
            for (int i = 1; i < noOfRows; i++) {
                //Getting the rows one by one and storing them in row variable
                XSSFRow row = sheet1.getRow(i);
                //Creating a new map for each row to store its data
                LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();
                //getting the count of atual cells that contain the data
                int noCells = row.getPhysicalNumberOfCells();
                //looping through all the cells to get the data
                for (int j = 0; j < noCells; j++) {
                    //inserting the data inside the map from a row
                    hashMap.put(row0.getCell(j).toString(), row.getCell(j).toString());
                }
                //storing the that map to the list
                excelData.add(hashMap);
            }
            //closing the file so that other programs can use it
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null)
                    fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //returning the data
        return excelData;
    }
}

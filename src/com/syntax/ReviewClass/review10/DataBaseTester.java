package com.syntax.ReviewClass.review10;

public class DataBaseTester {
    public static void main(String[] args) {
        DataBase dataBase = new MySQLServer(5);
        dataBase.openDataBase();
        dataBase.readData();
        dataBase.editData();
        dataBase.closeDataBase();

        DataBase[] dataBases = {new MySQLServer(5),new InformixDataBase(6), new GoogleDataBase(10)};
        for (DataBase data:dataBases
             ) {
            data.openDataBase();
            data.readData();
            data.editData();
            data.closeDataBase();
        }
    }
}

package com.syntax.ReviewClass.review10;

public abstract class DataBase {
    int numberOfConnetions;
    DataBase(int numberOfConnetions){
        this.numberOfConnetions=numberOfConnetions;
    }
    abstract void openDataBase();
    abstract void readData();
    abstract void editData();
    abstract void closeDataBase();
}
class MySQLServer extends DataBase{

    MySQLServer(int numberOfConnetions) {
        super(numberOfConnetions);
    }

    @Override
    void openDataBase() {
        System.out.println("Opening the DataBase from Microsoft");
    }

    @Override
    void readData() {
        System.out.println("Reading the DataBase from Microsoft");
    }

    @Override
    void editData() {
        System.out.println("Editing the DataBase from Microsoft");
    }

    @Override
    void closeDataBase() {
        System.out.println("Close the Microsoft DataBase");
    }
}
class InformixDataBase extends DataBase{
    InformixDataBase(int numberOfConnetions) {
        super(numberOfConnetions);
    }

    @Override
    void openDataBase() {
        System.out.println("Opening the DataBase from IBM");
    }

    @Override
    void readData() {
        System.out.println("Reading the DataBase from IBM");
    }

    @Override
    void editData() {
        System.out.println("Editing the DataBase from IBM");
    }

    @Override
    void closeDataBase() {
        System.out.println("Close the IBM DataBase");
    }
}
class GoogleDataBase extends DataBase{
    GoogleDataBase(int numberOfConnetions) {
        super(numberOfConnetions);
    }

    @Override
    void openDataBase() {
        System.out.println("Opening the DataBase from Google");
    }

    @Override
    void readData() {
        System.out.println("Reading the DataBase from Google");
    }

    @Override
    void editData() {
        System.out.println("Editing the DataBase from Google");
    }

    @Override
    void closeDataBase() {
        System.out.println("Close the Google DataBase");
    }
}

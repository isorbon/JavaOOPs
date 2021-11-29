package com.syntax.class24.interfacedemo2;

public interface Driveable {
    void drive();
}
class Bike implements Driveable{

    @Override
    public void drive() {
        System.out.println("Driving a bike");
    }
}
class Car implements Driveable{
    @Override
    public void drive() {
        System.out.println("Driving a Car");
    }
}
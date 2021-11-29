package com.syntax.TeamProject02.Task03;

public class CarRun {
    public static void main(String[] args) {
        Car[] cars ={new Sedan(12520,3.5), new Truck(43854,40)};
        for (Car car:cars
             ) {
            car.calculateSalePrice();
        }
    }
}

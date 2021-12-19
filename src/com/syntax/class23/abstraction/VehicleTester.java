package com.syntax.class23.abstraction;

public class VehicleTester {
    public static void main(String[] args) {
        BMW bmw = new BMW("132xl", "Sedan", "BMW", "X5");
        bmw.printVehicleCount();
        bmw.speed();
        bmw.start();
        bmw.drive();
        bmw.stop();

      /*  Vehicle[] vehicles = {new BMW("546543","Sedan","BMW","X6"), new Toyota("98765","Crasover","Toyota","Prado")};
        for (Vehicle veh:vehicles
             ) {
            veh.printVehicleCount();
            veh.drive();
            veh.stop();
            veh.start();
        }*/

    }
}

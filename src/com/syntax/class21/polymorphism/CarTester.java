package com.syntax.class21.polymorphism;

import com.syntax.class21.polymorphism.BMW;
import com.syntax.class21.polymorphism.Car;
import com.syntax.class21.polymorphism.Tesla;
import com.syntax.class21.polymorphism.Toyota;

public class CarTester {
    public static void main(String[] args) {
       /* BMW bmw=new BMW();
        bmw.start();
        bmw.stop();
        bmw.park();
        Tesla tesla=new Tesla();
        tesla.start();
        tesla.stop();
        tesla.park();
        Toyota toyota=new Toyota();
        toyota.start();
        toyota.stop();
        toyota.park();*/

        Car[] cars={new BMW(),new Tesla(),new Toyota()};
        for (Car car:cars
        ) {
            car.start();
            car.stop();
            car.park();
        }

    }
}

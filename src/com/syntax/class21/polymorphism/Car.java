package com.syntax.class21.polymorphism;

public class Car {

    void start(){
        System.out.println("Use keys to start me");
    }
    void stop(){
        System.out.println("Use brake to stop me");
    }
    void park(){
        System.out.println("Park me manually");
    }
}
class BMW extends Car{
    @Override
    void start() {
        System.out.println("Use the Button to start me");
    }
}
class Tesla extends Car{
    @Override
    void start() {
        System.out.println("Use Mobile App to start me");
    }

    @Override
    void park() {
        System.out.println("Use parking sensors to park me");
    }

}
class Toyota extends Car{

}
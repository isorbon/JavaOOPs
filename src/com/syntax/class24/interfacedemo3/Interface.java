package com.syntax.class24.interfacedemo3;

public interface Interface {

    default void method1() {
        System.out.println("I am a default method in Interface");
    }
    static void method2(){
        System.out.println("I am a static method in Interface");
    }
}

class Test implements Interface{

}
class Main{
    public static void main(String[] args) {
        Interface.method2();
      //  Interface.method1(); not allowed for default methods
        new Test().method1();
    }
}

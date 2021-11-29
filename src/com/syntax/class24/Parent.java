package com.syntax.class24;

public abstract class Parent {
    abstract void method1();
    abstract void method2();
}
abstract class Child extends Parent{
    @Override
    void method1() {
        System.out.println("Method 1 in Child");
    }
}
class GrandChild extends Child{
    @Override
    void method2() {
        System.out.println("Method two from GrandChild");
    }
}
class Tester{
    public static void main(String[] args) {
        Child child=new GrandChild();
        child.method1();
        child.method2();
    }
}


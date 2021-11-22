package com.syntax.class21;

public class Parent {
    String name="sedat";

    void printName(){
        System.out.println("name is "+name);
    }
    void getMarried(){
        System.out.println("Ahmet will get marry by my choice");
    }
}
class Child extends Parent{
    String name="Ahmet";
    void printName(){
        String name="Sharif";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
    @Override
    void getMarried(){
        System.out.println("But I like someome else");
    }

    void letsDo(){
        super.getMarried();
        getMarried();
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.letsDo();
    }

}
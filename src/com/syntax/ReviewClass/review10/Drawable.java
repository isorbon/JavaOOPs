package com.syntax.ReviewClass.review10;

public interface Drawable {
    // final void draw(); // We cannot final with method
    // private void draw(); // private and protected access modifiers are not allowed
    // static void draw(); // static keyword is also not allowed
    // int paperSize; // cannot left fields as un-initialize because fields are final
    // abstract int paperSize=12; //abstract keyword isn't allowed with fields anywhere
    int paperSize=12; // interface fields are public static and final by default
    // we don't have constructors in the interfaces because there are no instance fields
    void draw();
    static void staticMethod(){
        System.out.println("Im a static method inside an interface");
    }
    default void defaultMethod(){
        System.out.println("Im a default method");
    }
}
class Rectangle implements Drawable{

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
class Circle implements Drawable{

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

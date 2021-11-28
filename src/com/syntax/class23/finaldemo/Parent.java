package com.syntax.class23.finaldemo;

public class Parent {
    private final String NAME="Fatma";
    protected final int AGE=20;
    public final double WEIGHT_OF_AVG_HUMAN=30;
    final double HEIGHT=5.4;
    final static int NO_OF_LEGS=2;
    String hairColor="Black";
    private void printName(){
        System.out.println(NAME);
    }
    void printHairColor(){
        System.out.println(hairColor);
    }
    final void printAge(){
        System.out.println(AGE);
    }
    protected final void printHeight(){
        System.out.println(HEIGHT);
    }
    public final void printWeight(){
        System.out.println(WEIGHT_OF_AVG_HUMAN);
    }
    public static void printNoOfLegs(){
        // System.out.println(WEIGHT_OF_AVG_HUMAN); not allowed because its an instance field
        System.out.println(NO_OF_LEGS);
    }

   /* static final Parent(){
       //Not allowed
    }*/
}
class Child extends Parent{
    public static void printNoOfLegs(){
        // System.out.println(WEIGHT_OF_AVG_HUMAN); not allowed because its an instance field
        System.out.println("From Child"+NO_OF_LEGS);
    }
    void printHairColor(){
        System.out.println("Black from Child");
    }

}

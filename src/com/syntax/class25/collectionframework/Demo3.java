package com.syntax.class25.collectionframework;

public class Demo3 {
    public static void main(String[] args) {
        int primitiveNumber = 10;
        Integer classNumber = primitiveNumber; //we converted variable to object of class
        primitiveNumber = classNumber;
        System.out.println(classNumber);

        Integer number = new Integer(10); // boxing putting a primitive inside a wrapper
        Integer number2 = 10; //  auto inboxing putting a primitive inside a wrapper but using shortcut
        int another = number.intValue(); // unboxing longer way
        int another2=number2;  // auto unboxing shorter way
    }
}

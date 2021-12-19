package com.syntax.class20.homework;

public class CreditCard {
    /*Create a class CreditCard and define variable balance and interest. Create an instance method
    that will calculate interest based on the given balance. Create 2 subclasses: Visa and AX. In AX class
    override method calculate interest. Call the method by creating an object of each of the three classes.*/

    double balance;
    double interest;

    CreditCard(double balance) {
        this.balance = balance;
    }

    void calInterest() {
        interest = balance * 0.15;
        System.out.println(interest);
        System.out.println(balance);
    }
}

class Visa extends CreditCard {
    Visa(double balance) {
        super(balance);
    }
}

class AX extends CreditCard {
    AX(double balance) {
        super(balance);
    }

    @Override
    void calInterest() {
        interest = balance * 0.05;
        System.out.println(interest);
        System.out.println(balance);
    }

    public static void main(String[] args) {
        new CreditCard(100).calInterest();

        new Visa(300).calInterest();

        new AX(200).calInterest();
    }
}
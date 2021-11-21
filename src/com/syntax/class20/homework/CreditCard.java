package com.syntax.class20.homework;

public class CreditCard {
    /*Create a class CreditCard and define variable balance and interest. Create an instance method
    that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.*/

    double balance = 2555.23;
    double interest = 1.0;

    void calInterest(){
        System.out.println("Interest: " + (balance*interest)/100);
    }
}
class Visa extends CreditCard{ }

class AX extends CreditCard{
    double balance = 4203.75;
    double interest = 1.75;

    @Override
    void calInterest(){
        System.out.println("Override Interest: " + (balance*interest)/100);
    }

    public static void main(String[] args) {
        AX ax = new AX();
        ax.calInterest();

        Visa visa=new Visa();
        visa.calInterest();

        CreditCard creditCard = new CreditCard();
        creditCard.calInterest();
    }
}
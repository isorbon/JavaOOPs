package com.syntax.class26.homework.Card;

import com.syntax.class21.polymorphism.Car;

public abstract class Card {
  /*  Create a Card class that will have implemented and unimplemented methods and a constructor
    that will initializes credit card type.  Create 3 subclasses of a Card card.
    Create 3 objects of different card and store them into LinkedList.
    Using for loop/advanced for loop/ iterator access all methods of the class.*/
    String typeCard;

    Card(String typeCard){
        this.typeCard=typeCard;
    }
    void payment(){
        System.out.println("Online payment");
    }
    abstract void commision();
}

class Visa extends Card{

    Visa(String typeCard) {
        super(typeCard);
    }

    @Override
    void commision() {
        System.out.println(typeCard + " - no commission when withdrawing money in your country");
    }
}
class Master extends Card{

    Master(String typeCard) {
        super(typeCard);
    }

    @Override
    void commision() {
        System.out.println(typeCard + " - no commission when withdrawing money in any country");
    }
}
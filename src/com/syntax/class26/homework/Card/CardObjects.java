package com.syntax.class26.homework.Card;

import java.util.LinkedList;

public class CardObjects {
    public static void main(String[] args) {
        LinkedList<Card> cards = new LinkedList<>();
        cards.add(new Visa("Visa"));
        cards.add(new Master("MasterCard"));

        for (Card c:cards
             ) {
            c.payment();
            c.commision();
        }
    }
}

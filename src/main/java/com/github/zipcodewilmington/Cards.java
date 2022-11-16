package com.github.zipcodewilmington;

public class Cards {

    private String value;
    private String suit;

    public Cards(String cardValue, String cardSuits) {
        value = cardValue;
        suit = cardSuits;
    }
    @Override
    public String toString() {
        return value + " of " + suit;
    }
}
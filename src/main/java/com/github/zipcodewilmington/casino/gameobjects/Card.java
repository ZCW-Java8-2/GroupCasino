package com.github.zipcodewilmington.casino.gameobjects;

public class Card{
    CardDeckSuitEnum suit;
    CardDeckFaceEnum face;

    public Card(CardDeckSuitEnum suit, CardDeckFaceEnum face){
        this.suit = suit;
        this.face = face;
    }

    public CardDeckSuitEnum getSuit() {
        return suit;
    }

    public CardDeckFaceEnum getFace() {
        return face;
    }

}

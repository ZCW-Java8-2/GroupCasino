package com.github.zipcodewilmington.casino.gameobjects;

public class SingleCard {
    CardDeckSuitEnum suit;
    CardDeckFaceEnum face;

    public SingleCard(CardDeckSuitEnum suit, CardDeckFaceEnum face){
        this.suit = suit;
        this.face = face;
    }

    public CardDeckSuitEnum getSuit() {
        return suit;
    }

    public CardDeckFaceEnum getFace() {
        return face;
    }

    public String cardValue(){
        return face + " of " + suit;
    }
}

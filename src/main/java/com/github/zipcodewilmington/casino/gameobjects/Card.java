package com.github.zipcodewilmington.casino.gameobjects;

public class Card {
    public CardDeckSuitEnum suit;
    public CardDeckFaceEnum value;

    public  Card(CardDeckSuitEnum suit, CardDeckFaceEnum value){
        this.suit = suit;
        this.value = value;
    }
}

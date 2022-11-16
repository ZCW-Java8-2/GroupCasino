package com.github.zipcodewilmington.casino.games.Card;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class CardDeck{
    private List<Card> deck;
    private int numberOfDeck;

    public CardDeck(List deck, int numberOfDeck){
        this.deck=deck;
        this.numberOfDeck=numberOfDeck;
    }

    public List<Card> getDeck() {
        return this.deck;
    }

    public void setDeck(List<Card> deck) {
        this.deck= deck;
    }

    public int getNumberOfDeck() {
        return this.numberOfDeck;
    }

    public void setNumberOfDeck(int numberOfDeck) {
        this.numberOfDeck = numberOfDeck;
    }
    public Card drawNextCard(){
        return this.deck.get((int)Math.random()*deck.size());
    }
}

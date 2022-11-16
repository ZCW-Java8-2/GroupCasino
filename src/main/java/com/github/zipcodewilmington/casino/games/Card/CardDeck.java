package com.github.zipcodewilmington.casino.games.Card;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.List;
public class CardDeck {
    private List<Card> deck;
    private int numberOfDeck;

    public CardDeck(List<Card> deck, int numberOfDeck){
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
    public void shuffle(){
        Collections.shuffle(deck);
    }
    public void populateDeck(){
        this.deck.add(new Card(Suits.CLUBS,PrintedValues.TWO,false));
        Suits.valueOf();
    }

}

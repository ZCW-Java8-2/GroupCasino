package com.github.zipcodewilmington.casino.games.Card;
import java.util.*;

public class CardDeck {
    private Stack<Card> deck;
    private int numberOfDeck;

    public CardDeck(Stack<Card> deck, int numberOfDeck) {
        this.deck = new Stack<>();
        this.numberOfDeck = numberOfDeck;
        for (int k = 0; k < numberOfDeck; k++) { //num of decks
            for (int i = 0; i < 13; i++) { //printed values
                PrintedValues value = PrintedValues.values()[i];

                for (int j = 0; j < 4; j++) {
                    Card card = new Card(Suits.values()[j], value, false);
                    this.deck.add(card); //suits
                }
            }
        }
        this.shuffle();
    }

    public Stack<Card> getDeck() {
        return this.deck;
    }

    public void setDeck(Stack<Card> deck) {
        this.deck = deck;
    }

    public int getNumberOfDeck() {
        return this.numberOfDeck;
    }

    public void setNumberOfDeck(int numberOfDeck) {
        this.numberOfDeck = numberOfDeck;
    }
    public Card drawNextCard(){
        return this.deck.pop();
    }
    public void shuffle(){
        Collections.shuffle(deck);
    }


}

package com.github.zipcodewilmington.casino.games.Card;

public class Card {
private Suits suit;
private PrintedValues printedValues;
private boolean faceUp = false;

    public Card(Suits suit, PrintedValues printedValues, boolean faceUp) {
        this.suit = suit;
        this.printedValues = printedValues;
        this.faceUp = faceUp;
    }

    public Suits getSuit() {
        return suit;
    }

    public void setSuit(Suits suit) {
        this.suit = suit;
    }

    public PrintedValues getPrintedValues() {
        return printedValues;
    }

    public void setPrintedValues(PrintedValues printedValues) {
        this.printedValues = printedValues;
    }

    public boolean getIsFaceUp() {
        return faceUp;
    }

    public void setFaceUp(boolean faceUp) {
        this.faceUp = faceUp;
    }

    public void flipCard(){
        this.faceUp = !faceUp;
    }
}

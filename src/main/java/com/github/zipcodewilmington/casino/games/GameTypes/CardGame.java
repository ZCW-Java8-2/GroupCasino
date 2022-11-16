package com.github.zipcodewilmington.casino.games.GameTypes;

import com.github.zipcodewilmington.casino.games.Card.CardDeck;

public abstract class CardGame {
    private CardDeck deck;

    public CardGame(CardDeck deck) {
        this.deck = deck;
    }
}

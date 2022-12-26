package com.github.zipcodewilmington.casino.games.BlackJack;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.games.Card.Card;
import com.github.zipcodewilmington.casino.games.Card.CardDeck;
import com.github.zipcodewilmington.casino.games.GameTypes.CardGame;

import java.util.List;

public class BlackJackGame extends CardGame {
    private List<Card> dealerHand;
    private int winnings;
    private int currentBet;
    private List<Card> playerHand;

    public BlackJackGame(CardDeck deck,List<Card> dealerHand,int winnings,int currentBet, List<Card> playerHand) {
        super(deck);
        this.dealerHand = dealerHand;
        this.currentBet = currentBet;
        this.winnings = winnings;
        this.playerHand = playerHand;
    }


    public void play(){

    }








    //test comment
}

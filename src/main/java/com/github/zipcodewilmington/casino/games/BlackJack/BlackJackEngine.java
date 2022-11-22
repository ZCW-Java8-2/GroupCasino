package com.github.zipcodewilmington.casino.games.BlackJack;

import com.github.zipcodewilmington.casino.casinoaccount.CasinoAccount;
import com.github.zipcodewilmington.casino.gameobjects.DeckOfCards;
import com.github.zipcodewilmington.casino.gameobjects.SingleCard;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

import java.io.Console;
import java.util.ArrayList;

public class BlackJackEngine {
    BlackJackGame game = new BlackJackGame();
    private static IOConsole console = new IOConsole(AnsiColor.YELLOW);
//    public void run(CasinoAccount activeAccount) {
//        DeckOfCards deck = new DeckOfCards();
//        deck.drawRandomCard();
//    }
public static void main(String[] args) {
    DeckOfCards deck = new DeckOfCards();
    BlackJackGame game = new BlackJackGame();
    IOConsole console = new IOConsole(AnsiColor.YELLOW);
    //create dealer and player hands
    ArrayList<SingleCard> dealerHand = new ArrayList<>();
    ArrayList<SingleCard> playerHand = new ArrayList<>();
    int dealerSum = 0;
    int playerSum = 0;

    //draw 4 initial cards
    for(int i = 0; i < 2; i++) {
        dealerHand.add(deck.drawRandomCard());
        playerHand.add(deck.drawRandomCard());
    }

    console.println(String.valueOf(dealerHand)); //test
    console.println(String.valueOf(playerHand)); //test

    //add values
    for(int i = 0; i < dealerHand.size(); i++) {
        dealerSum += game.getFaceValue(dealerHand.get(i));
        playerSum += game.getFaceValue(playerHand.get(i));
    }
    //isPlayerAce();
    console.println(String.valueOf(dealerSum));
    console.println(String.valueOf(playerSum));



}



}

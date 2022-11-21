package com.github.zipcodewilmington.casino.games.War;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.games.Card.Card;
import com.github.zipcodewilmington.casino.games.Card.CardDeck;
import com.github.zipcodewilmington.casino.games.GameTypes.CardGame;
import com.github.zipcodewilmington.utils.IOConsole;

import java.util.Scanner;
import java.util.Stack;


public class WarGame extends CardGame implements GameInterface {
    private Stack<Card> playerDeck;
    private Stack<Card> dealerDeck;
    private int playerScore;
    private int dealerScore;
    private boolean keepPlaying = true;

    public WarGame(CardDeck deck) {
        super(deck);
    }

    public Stack<Card> getPlayerDeck() {
        return playerDeck;
    }

    public void setPlayerDeck(Stack<Card> playerDeck) {
        this.playerDeck = playerDeck;
    }

    public Stack<Card> getDealerDeck() {
        return dealerDeck;
    }

    public void setDealerDeck(Stack<Card> dealerDeck) {
        this.dealerDeck = dealerDeck;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public int getDealerScore() {
        return dealerScore;
    }

    public boolean isKeepPlaying() {
        return keepPlaying;
    }

    public void setKeepPlaying(boolean keepPlaying) {
        this.keepPlaying = keepPlaying;
    }

    public void setDealerScore(int dealerScore) {
        this.dealerScore = dealerScore;
    }

    public void splitDeck(){
        this.deck.shuffle();
        playerDeck = fillHalfDeck(this.deck);
        dealerDeck = fillSecondHalfDeck(this.deck);
    }
    public Stack<Card> fillHalfDeck(CardDeck deck){
        Stack<Card> halfDeck = new Stack<>();
        for(int i = 0; i < 26;i++){
            halfDeck.add(deck.drawNextCard());
        }
        return halfDeck;
    }
    public Stack<Card> fillSecondHalfDeck(CardDeck deck){
        Stack<Card> halfDeck = new Stack<>();
        for(int i = 26; i < 52;i++){
            halfDeck.add(deck.drawNextCard());
        }
        return halfDeck;
    }
    public boolean playerCardBetter(Card playerCard, Card dealerCard){ //return true for player
       return playerCard.getPrintedValues().compareTo(dealerCard.getPrintedValues()) > 0;
    }
    public boolean isTie(Card playerCard, Card dealerCard){
        return playerCard.getPrintedValues().compareTo(dealerCard.getPrintedValues()) == 0;
    }
    public void advanceTheGame(){
        Scanner in = new Scanner(System.in);
        System.out.println("Press any key + ENTER to cont.");
        String input = in.nextLine();
    }
    public void advanceTheGameOrExit(){
        Scanner in = new Scanner(System.in);
        System.out.println("Press X + enter to stop OR any other key to continue. ");
        String input = in.nextLine();
        if(input.equalsIgnoreCase("x")){
            setKeepPlaying(false);
            System.out.println("Game will end after this round.");
        }
    }
    public Card drawThreeThenFlipUpFourth(Stack<Card> deck){
        if(deck.size() > 3) {
            for (int i = 1; i <= 3; i++) {
                deck.pop();
            }
        }
        return deck.pop();
    }

    @Override
    public void add(PlayerInterface player) {

    }

    @Override
    public void remove(PlayerInterface player) {

    }

    @Override
    public Boolean checkWinner() {
        return null;
    }

    public void run() {
        Card playerCurrentCard;
        Card dealerCurrentCard;
        System.out.println("Welcome to war.\n Deck will be split good luck. \n");
        splitDeck();
        advanceTheGame();
        while(playerDeck.size() > 0 && keepPlaying){
            playerCurrentCard = playerDeck.pop();
            dealerCurrentCard = dealerDeck.pop();
            System.out.println("Your card is " + playerCurrentCard.toString() + " dealer card is " + dealerCurrentCard);
            while(isTie(playerCurrentCard, dealerCurrentCard)){
                System.out.println("WAR!!");
                playerCurrentCard = drawThreeThenFlipUpFourth(playerDeck);
                dealerCurrentCard = drawThreeThenFlipUpFourth(dealerDeck);
                System.out.println("Your card is ||" + playerCurrentCard.toString() + " dealer card is " + dealerCurrentCard);
                advanceTheGame();
            }
            if(playerCardBetter(playerCurrentCard,dealerCurrentCard)){
                playerScore++;
                System.out.println("You won that hand!\n");
            }
            else{
                dealerScore++;
                System.out.println("Dealer had better! Better luck next draw.\n");
            }
            System.out.println("Updated Scores: You: " + playerScore +" Dealer:" + dealerScore);
            advanceTheGameOrExit();
        }
        System.out.println("Final Score: \n" + playerScore + " "+ dealerScore);
    }
}

//fix WAR at the end of the deck
//Exception in thread "main" java.util.EmptyStackException
//        at java.base/java.util.Stack.peek(Stack.java:101)
//        at java.base/java.util.Stack.pop(Stack.java:83)
//        at com.github.zipcodewilmington.casino.games.War.WarGame.drawThreeThenFlipUpFourth(WarGame.java:86)
//        at com.github.zipcodewilmington.casino.games.War.WarGame.run(WarGame.java:119)
//        at com.github.zipcodewilmington.Casino.play(Casino.java:92)
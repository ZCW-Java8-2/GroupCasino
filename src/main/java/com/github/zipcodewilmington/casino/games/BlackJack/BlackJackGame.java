package com.github.zipcodewilmington.casino.games.BlackJack;

import com.github.zipcodewilmington.casino.GamblingInterface;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.gameobjects.CardDeckFaceEnum;
import com.github.zipcodewilmington.casino.gameobjects.DeckOfCards;
import com.github.zipcodewilmington.casino.gameobjects.SingleCard;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

public class BlackJackGame implements GamblingInterface, GameInterface {
    private int playerScoreSum, dealerScoreSum;
    IOConsole console = new IOConsole(AnsiColor.YELLOW);





    //TODO create card
//    private Card dealerInitialCard;

    public int hit(){
        return 0;
    }

    public void stay(){
    }

    //TODO create card
//    public boolean isAce(Card card){
//        return true;
//    }

    public int flipDealersCard(){
        return 0;
    }

    public int getFaceValue(SingleCard card) {
        if (CardDeckFaceEnum.TWO.equals(card.getFace())) {
            return 2;
        } else if (CardDeckFaceEnum.THREE.equals(card.getFace())) {
            return 3;
        } else if (CardDeckFaceEnum.FOUR.equals(card.getFace())) {
            return 4;
        } else if (CardDeckFaceEnum.FIVE.equals(card.getFace())) {
            return 5;
        } else if (CardDeckFaceEnum.SIX.equals(card.getFace())) {
            return 6;
        } else if (CardDeckFaceEnum.SEVEN.equals(card.getFace())) {
            return 7;
        } else if (CardDeckFaceEnum.EIGHT.equals(card.getFace())) {
            return 8;
        } else if (CardDeckFaceEnum.NINE.equals(card.getFace())) {
            return 9;
        } else if (CardDeckFaceEnum.TEN.equals(card.getFace())) {
            return 10;
        } else if (CardDeckFaceEnum.JACK.equals(card.getFace())) {
            return 10;
        } else if (CardDeckFaceEnum.QUEEN.equals(card.getFace())) {
            return 10;
        } else if (CardDeckFaceEnum.KING.equals(card.getFace())) {
            return 10;
        } else if (CardDeckFaceEnum.ACE.equals(card.getFace())) {
            return 1; //plus 10 on Engine
        }
        return 0;
    }

    public int isPlayerAce(SingleCard card) {
        if (CardDeckFaceEnum.ACE.equals(card.getFace())) {
            return console.getIntegerInput("You drew an ace! Would you like the value to be 1 or 11?");
        } return 0;
    }

    public String findWinner(int playerScoreSum, int dealerScoreSum) {

        if ((playerScoreSum > dealerScoreSum) && (!isGreaterThan21(playerScoreSum))){
            return "Player Wins!";

        } else if ((playerScoreSum < dealerScoreSum) && (isGreaterThan21(dealerScoreSum)) && (!isGreaterThan21(playerScoreSum))){
            return "Player Wins!";

        } else if ((playerScoreSum < dealerScoreSum) && (!isGreaterThan21(dealerScoreSum))){
            return "Dealer Wins!";

        } else if ((playerScoreSum > dealerScoreSum) && (isGreaterThan21(playerScoreSum)) && (!isGreaterThan21(dealerScoreSum))){
            return "Dealer Wins!";

        } else if ((playerScoreSum == dealerScoreSum) && (!isGreaterThan21(playerScoreSum))){
            return "Tie!";
        }

        return "Both Lose!";
    }

    public boolean isGreaterThan21(int playerScoreSum){
        return playerScoreSum > 21; // returns true if
    }

    @Override
    public double winBet(double bet, double balance) {
        return 0;
    }

    @Override
    public double loseBet(double bet, double balance) {
        return 0;
    }

    @Override
    public void addToBalance() {

    }

    @Override
    public void subFromBalance() {

    }

    @Override
    public void run() {

    }

    @Override
    public void gameName() {

    }

    @Override
    public void gameRules() {

    }

    @Override
    public void add(PlayerInterface player) {

    }

    @Override
    public void remove(PlayerInterface player) {

    }

    @Override
    public void isGameOver() {

    }

    @Override
    public boolean evaluateTurn() {
        return false;
    }

    @Override
    public void playAgain() {

    }

    @Override
    public void exitCasino() {

    }
}

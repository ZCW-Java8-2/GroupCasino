package com.github.zipcodewilmington.casino.games.BlackJack;

public class BlackJackGame {

    private int playerScoreSum, dealerScoreSum;

    //TODO create cards/deck
//    private ArrayList<Cards> deck;

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
}
